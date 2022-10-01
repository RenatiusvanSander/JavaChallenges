package edu.remad.javachallenges.mathtasks.task2_2;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Converts roman number to decimal number or backwards
 */
public class RomanNumberConverter {

  /**
   * Key is the character as roman number and value is the decimal number
   */
  private static Map<Character, Integer> valueMap = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C',
      100, 'D', 500, 'M', 1000);

  /**
   * look up table for roman number
   */
  private static Map<Integer, String> intToRomanDigitMap = new TreeMap<>();

  static {
    intToRomanDigitMap.put(1, "I");
    intToRomanDigitMap.put(4, "IV");
    intToRomanDigitMap.put(5, "V");
    intToRomanDigitMap.put(9, "IX");
    intToRomanDigitMap.put(10, "X");
    intToRomanDigitMap.put(40, "XL");
    intToRomanDigitMap.put(50, "L");
    intToRomanDigitMap.put(90, "XC");
    intToRomanDigitMap.put(100, "C");
    intToRomanDigitMap.put(400, "CD");
    intToRomanDigitMap.put(500, "D");
    intToRomanDigitMap.put(900, "CM");
    intToRomanDigitMap.put(1000, "M");
  };

  /**
   * Converts roman number to decimal number
   *
   * @param romanNumber string encoded roman number to convert to decimal number
   * @return converted decimal number
   */
  public static int fromRomanNumber(final String romanNumber) {
    int value = 0;
    int lastDigitValue = 0;

    for (int i = romanNumber.length() - 1; i >= 0; i--) {
      final char romanDigit = romanNumber.charAt(i);
      final int digitValue = valueMap.getOrDefault(romanDigit, 0);

      final boolean addMode = digitValue >= lastDigitValue;
      if (addMode) {
        value += digitValue;
        lastDigitValue = digitValue;
      } else {
        value -= digitValue;
      }
    }

    return value;
  }

  /**
   * Number convert to Roman Number
   *
   * @param value number to convert to roman Number
   * @return string encoded Roman Number
   */
  public static String toRomanNumber(final int value) {
    String result = "";
    int remainder = value;

    final Comparator<Integer> reversed = Comparator.reverseOrder();
    final Map<Integer, String> sortedIntToRomanDigit = new TreeMap<>(reversed);
    sortedIntToRomanDigit.putAll(intToRomanDigitMap);

    var it = sortedIntToRomanDigit.entrySet().iterator();
    while (it.hasNext() && remainder > 0) {
      final Map.Entry<Integer, String> entry = it.next();

      final int multiplier = entry.getKey();
      final char romanDigit = entry.getValue().toCharArray()[0];

      final int times = remainder / multiplier;
      remainder = remainder % multiplier;

      result += repeatCharSequence("" + romanDigit, times);
    }

    return result;
  }

  private static String repeatCharSequence(final String value, int times) {
    final StringBuilder result = new StringBuilder();

    for (int i = 0; i < times; i++) {
      result.append(value);
    }

    return result.toString();
  }
}
