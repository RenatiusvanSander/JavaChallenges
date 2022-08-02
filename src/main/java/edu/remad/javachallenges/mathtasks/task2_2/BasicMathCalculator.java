package edu.remad.javachallenges.mathtasks.task2_2;

/**
 * Basic multiply, division and modula rest of 7 is returned.
 */
public class BasicMathCalculator {

  /**
   * Calculates a number
   *
   * @param firstNumber first number
   * @param secondNumber second number
   * @return calculated Number
   */
  public int calc(int firstNumber, int secondNumber) {
    int resultMultiply = firstNumber * secondNumber;
    int resultDivision = resultMultiply / 2;

    return resultDivision % 7;
  }
}
