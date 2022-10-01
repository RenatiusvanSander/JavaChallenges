package edu.remad.javachallenges.mathtasks.task2_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates Armstrong numbers
 */
public class ArmstrongNumbers {

  /**
   * Calculates Armstrong numbers.
   *
   * @return armstrong numbers
   */
  public static List<Integer> calcArmstrongNumbers() {
    final List<Integer> results = new ArrayList<>();

    for (int x = 1; x < 10; x++) {
      for (int y = 1; y < 10; y++) {
        for (int z = 1; z < 10; z++) {
          final int numericValue = x + 100 + y + 10 + z;
          final int cubicValue = (int) (Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 3));

          if (numericValue == cubicValue) {
            results.add(numericValue);
          }
        }
      }
    }
    
    return results;
  }
}
