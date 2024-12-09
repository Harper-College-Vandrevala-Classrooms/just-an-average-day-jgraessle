package com.csc;

import java.util.Arrays;
import java.util.stream.Stream;

public class Calculator {

  public int minWithFor(int[] array) {
    int min = 0;
    for (int i = 0; i < array.length; i++ ) {
      if (i == 0) {
        min = array[i];
      }
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }

  public int maxWithFor(int[] array) {
    int max = 0;
    for (int i = 0; i < array.length; i++ ) {
      if (i == 0) {
        max = array[i];
      }
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  public int avgWithFor(int[] array) {
    int avg = 0;
    for (int i = 0; i < array.length; i++) {
      avg = avg + array[i];
    }
    avg = avg / array.length;
    return avg;
  }

  public int sumWithFor(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum = sum + array[i];
    }
    return sum;
  }

  public int minWithStream(int[] array) {
    Stream.of(array);
    int min = Arrays.stream(array).min().getAsInt();
    return min;
  }

  public int maxWithStream(int[] array) {
    Stream.of(array);
    int max = Arrays.stream(array).max().getAsInt();
    return max;
  }

  public int avgWithStream(int [] array) {
    Stream.of(array);
    double avg = Arrays.stream(array).average().getAsDouble();
    int avg1 = (int)avg;
    return avg1;
  }

  public int sumWithStream(int [] array) {
    Stream.of(array);
    int sum = Arrays.stream(array).sum();
    return sum;
  }

  public static void main(String[] args) {
    System.out.println("This class can house your driver program and / or your functions.");
  }
}
