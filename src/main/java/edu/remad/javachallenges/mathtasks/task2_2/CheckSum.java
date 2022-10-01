package edu.remad.javachallenges.mathtasks.task2_2;

import java.util.regex.Pattern;

/**
 * Calculates a check sum.
 */
public class CheckSum {

  /**
   * Regex for all characters are digits
   */
  private static final String REGEX = "\\d+";

  /**
   * pattern to compile regex for validation
   */
  private static final Pattern PATTERN = Pattern.compile(REGEX);

  /**
   * Calculates check sum
   *
   * @param number string encoded number
   * @return check sum
   */
  public static int calcChecksum(String number) {
    if(!PATTERN.matcher(number).matches() ) {
      throw new NumberFormatException("number is not string encoded number.");
    }

    int sum = 0;
    for(int i = 0; i < number.length(); i++) {
      char digit = number.charAt(i);
      int currentDigit = Integer.parseInt("" + digit);
      sum += ((i + 1) * currentDigit);
    }
    sum = sum % 10;

    return sum;
  }
}
