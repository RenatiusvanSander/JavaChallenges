package edu.remad.javachallenges.mathtasks;

import java.util.ArrayList;
import java.util.List;

/**
 * Finds proper divisor for a number
 */
public class ProperDivisorFinder {

  /**
   * Finds divisors.
   *
   * @param value number to get divisors for
   * @return divisors as numbers
   */
  public static List<Integer> findProperDivisors(final int value) {
    final List<Integer> divisors = new ArrayList<>();

    for(int i = 1; i <= value /2;i++) {
      if(value % i == 0) {
        divisors.add(i);
      }
    }

    return divisors;
  }
}
