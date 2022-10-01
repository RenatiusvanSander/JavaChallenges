package edu.remad.javachallenges.mathtasks.task2_2;

/**
 * Combinatoric show a brute force way to solution and use of quadratic solution
 */
public class Combinatoric {

  /**
   *Calcs brute force the combinatoric
   */
  public void calcBrutalCombinatorice() {
    for (int a = 1; a < 100; a++) {
      for (int b = 1; b < 100; b++) {
        for (int c = 1; c < 100; c++) {
          if (a * a + b * b == c * c) {
            System.out.println(String.format("a = %d / b = %d / c = %d", a, b, c));
          }
        }
      }
    }
  }

  /**
   * Solves with quadratic root the task faster
   */
  public void solveQuadratic() {
    for (int a = 1; a < 100; a++) {
      for (int b = 1; b < 100; b++) {
        final int c = (int) Math.sqrt(a * a + b * b);
        if (a * a + b * b == c * c) {
          System.out.println(String.format("a = %d / b = %d / c = %d", a, b, c));
        }
      }
    }
  }
}
