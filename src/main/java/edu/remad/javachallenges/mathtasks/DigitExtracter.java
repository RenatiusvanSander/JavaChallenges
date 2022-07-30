package edu.remad.javachallenges.mathtasks;

/**
 * Extracts digits
 */
public class DigitExtracter {

  /**
   * Extract digits.
   *
   * @param startValue the start value to extract digits for
   */
  public static void extractDigits(final int startValue) {
    int remainingValue = startValue;

    while(remainingValue > 0) {
      final int digit = remainingValue % 10;
      System.out.print(digit + " ");

      remainingValue = remainingValue / 10;
    }

    System.out.println();
  }
}
