package edu.remad.javachallenges.mathtasks.task2_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Calculates the perfect numbers of a range
 */
public class PerfectNumber {

  /**
   *
   * @param maxEclusive
   * @return
   */
  public static List<Integer> calcPerfectNumbers(final int maxExclusive) {
    final List<Integer> results = new ArrayList<>();

    for(int i = 2; i < maxExclusive; i++) {
      if(isPerfectNumberSimple(i)) {
        results.add(i);
      }
    }

    return results;
  }

  /**
   * Validates a perfect number.
   *
   * @param number number to check for perfect number
   * @return true / false for is a perfect number
   */
  public static boolean isPerfectNumberSimple(final int number) {
    int sumOfMultipliers = 1;

    for(int i = 2; i <= number / 2; i++) {
      if(number % i == 0) {
        sumOfMultipliers += i;
      }
    }

    return sumOfMultipliers == number;
  }
}
