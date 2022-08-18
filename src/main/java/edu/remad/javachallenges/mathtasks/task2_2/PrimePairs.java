package edu.remad.javachallenges.mathtasks.task2_2;

import edu.remad.javachallenges.mathtasks.EratosthenesSieve;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Calculates prime pairs for twin, cousin and sexy
 */
public class PrimePairs {

  /**
   * Calculates prime pairs
   *
   * @param limitNumber the limit as number to calculate prime pairs for twin, cousin, sexy
   * @return the prime pairs for twin, cousin, sexy
   */
  public static List<Map<Integer, Integer>> calculatePairs(int limitNumber) {
    EratosthenesSieve sieve = new EratosthenesSieve(limitNumber);
    List<Integer> primeNumbers = sieve.execute();

    Map<Integer, Integer> twinPairs = new TreeMap<>();
    Map<Integer, Integer> cousinPairs = new TreeMap<>();
    Map<Integer, Integer> sexyPairs = new TreeMap<>();

    int number;
    int twinPrimeNumber;
    int cousinPrimeNumber;
    int sexyPrimeNumber;
    for (int i = 3; i < limitNumber; i++) {
      number = i;
      twinPrimeNumber = number + 2;
      cousinPrimeNumber = number + 4;
      sexyPrimeNumber = number + 6;

      boolean isPrime = isPrime(primeNumbers, number);
      boolean isTwin = isPrime && isTwin(primeNumbers, twinPrimeNumber);
      boolean isCousin = isPrime && isCousin(primeNumbers, cousinPrimeNumber);
      boolean isSexy = isPrime && isSexy(primeNumbers, sexyPrimeNumber);

      if (isTwin) {
        twinPairs.put(number, twinPrimeNumber);
      }

      if (isCousin) {
        cousinPairs.put(number, cousinPrimeNumber);
      }

      if (isSexy) {
        sexyPairs.put(number, sexyPrimeNumber);
      }
    }

    return List.of(twinPairs, cousinPairs, sexyPairs);
  }

  /**
   * Validates prime number
   *
   * @param primeNumbers the identified prime numbers
   * @param number       current number to validate as
   * @return true / false for is a prime number
   */
  private static boolean isPrime(List<Integer> primeNumbers, int number) {
    return primeNumbers.contains(number);
  }

  /**
   * Validates twin
   *
   * @param primeNumbers the identified prime numbers
   * @param number       current number to validate as
   * @return true / false for is a twin prime number
   */
  private static boolean isTwin(List<Integer> primeNumbers, int number) {
    return primeNumbers.contains(number);
  }

  /**
   * Validates cousin
   *
   * @param primeNumbers the identified prime numbers
   * @param number       current number to validate as
   * @return true / false for is a cousin prime number
   */
  private static boolean isCousin(List<Integer> primeNumbers, int number) {
    return primeNumbers.contains(number);
  }

  /**
   * Validates sexy
   *
   * @param primeNumbers the identified prime numbers
   * @param number       current number to validate as
   * @return true / false for is a sexy prime number
   */
  private static boolean isSexy(List<Integer> primeNumbers, int number) {
    return primeNumbers.contains(number);
  }
}
