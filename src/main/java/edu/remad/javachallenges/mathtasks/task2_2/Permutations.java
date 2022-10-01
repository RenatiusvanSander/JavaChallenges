package edu.remad.javachallenges.mathtasks.task2_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Calculates permutation for maximal possible changes
 */
public class Permutations {

  /**
   * Calculates maximal possible changes
   *
   * @param values value numbers to calculate maximal possible change for
   * @return maximal possible changes
   */
  public static int calcMaxPossibleChange(final List<Integer> values) {
    final List<Integer> sortedNumbers = new ArrayList<>(values);
    sortedNumbers.sort(Integer::compareTo);

    int maxPossibleChange = 0;

    for(int currentValue : sortedNumbers) {
      if(currentValue > maxPossibleChange + 1) {
        return maxPossibleChange;
      }

      maxPossibleChange += currentValue;
    }

    return maxPossibleChange;
  }
}
