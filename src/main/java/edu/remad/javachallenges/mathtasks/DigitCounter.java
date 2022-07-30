package edu.remad.javachallenges.mathtasks;

/**
 * Counts digits of a nummber
 */
public class DigitCounter {

  /**
   * Counts digits
   *
   * @param number number to count digits for
   * @return counted digits
   */
  public static int countDigits(final int number) {
    int count = 0;

    int remainingValue = number;
    while(remainingValue > 0) {
      remainingValue = remainingValue / 10;
      count++;
    }

    return count;
  }
}
