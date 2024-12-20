package com.csc;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalculator {

  Calculator calculator = new Calculator();
  int[] testArray = {1, 4, 7, 2, 5, 8, 3, 6};
  int[] fiveArray = {6, 9, 12, 7, 10, 13, 8, 11};
  int[] squareArray = {1, 16, 49, 4, 25, 64, 9, 36};
  @Test
  void itWorks() {
    assertEquals(true, true);
  }
  @Test
  void minForWorks() {
    assertEquals(1, calculator.minWithFor(testArray));
  }
  @Test
  void maxForWorks() {
    assertEquals(8, calculator.maxWithFor(testArray));
  }
  @Test
  void avgForWorks() {
    assertEquals(4, calculator.avgWithFor(testArray));
  }
  @Test
  void sumForWorks() {
    assertEquals(36, calculator.sumWithFor(testArray));
  }
  @Test
  void minStreamWorks() {
    assertEquals(1, calculator.minWithStream(testArray));
  }
  @Test
  void maxStreamWorks() {
    assertEquals(8, calculator.maxWithStream(testArray));
  }
  @Test
  void avgStreamWorks() {
    assertEquals(4, calculator.avgWithStream(testArray));
  }
  @Test
  void sumStreamWorks() {
    assertEquals(36, calculator.sumWithStream(testArray));
  }
  @Test
  void add5Works() {
    assertArrayEquals(fiveArray, calculator.add5(testArray));
  }
  @Test
  void squareWorks() {
    assertArrayEquals(squareArray, calculator.square(testArray));
  }
}
