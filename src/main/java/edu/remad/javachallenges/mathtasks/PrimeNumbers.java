package edu.remad.javachallenges.mathtasks;

/**
 * Processes prime numbers for a number.
 */
public class PrimeNumbers {

  /**
   * validates a prime number.
   *
   * @param potentiallyPrime a number that is potentially prime number candidate
   * @return true / false for is a prime number
   */
  public static boolean isPrime(final int potentiallyPrime) {
    for(int i = 2; i <= potentiallyPrime / 2; i++) {
      if(potentiallyPrime % i == 0) {
        return false;
      }
    }

    return true;
  }
}
