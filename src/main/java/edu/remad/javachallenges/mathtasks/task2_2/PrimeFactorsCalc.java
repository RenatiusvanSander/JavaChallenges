package edu.remad.javachallenges.mathtasks.task2_2;

import edu.remad.javachallenges.mathtasks.EratosthenesSieve;
import java.util.ArrayList;
import java.util.List;

/**
 * Calculator for PrimeFactors
 */
public class PrimeFactorsCalc {

  /**
   * Calculates prime factors
   *
   * @param number the number to calculate prime factors for
   * @return prime factors
   */
  public List<Integer> calcPrimeFactors(int number) {
    EratosthenesSieve sieve = new EratosthenesSieve(number);
    final List<Integer> allPrimes = sieve.execute();
    final List<Integer> primeFactors = new ArrayList<>();

    int remainingValue = number;

    while(remainingValue % 2 == 0 && remainingValue >= 2) {
      remainingValue /= 2;
      primeFactors.add(2);
    }

    if(isPrime(allPrimes, remainingValue)){
      primeFactors.add(remainingValue);
    } else {
      while (remainingValue > 1) {
        for(final Integer currentPrime : allPrimes) {
          if(remainingValue % currentPrime == 0) {
            remainingValue = remainingValue / currentPrime;
            primeFactors.add(currentPrime);
            break;
          }
        }
      }
    }

    return primeFactors;
  }

  /**
   * Validates is prime.
   *
   * @param allPrimes prime numbers
   * @param n remaining value
   * @return
   */
  public static boolean isPrime(final List<Integer> allPrimes, final int n) {
    return allPrimes.contains(n);
  }
}
