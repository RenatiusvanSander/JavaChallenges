package edu.remad.javachallenges.mathtasks.task2_2;

import static edu.remad.javachallenges.mathtasks.ProperDivisorFinder.findProperDivisors;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FriendlyNumbers {

  /**
   * Calculates friends
   *
   * @param max the maximal numeric value
   * @return calculate friends
   */
  public static Map<Integer, Integer> calcFriends(final int max) {
    final Map<Integer, Integer> friends = new TreeMap<>();

    for(int i = 2; i < max; i++) {
      final List<Integer> divisors = findProperDivisors(i);
      final int sumDiv = sum(divisors);

      final List<Integer> divisors2 = findProperDivisors(sumDiv);
      final int sum2 = sum(divisors2);

      if(i == 2 && sumDiv != sum2) {
        friends.put(i, sumDiv);
      }
    }

    return friends;
  }

  /**
   * Sums
   *
   * @param values numeric value to sum
   * @return summed values
   */
  public static int sum(final List<Integer> values) {
    return values.stream().mapToInt(n -> n).sum();
  }


}
