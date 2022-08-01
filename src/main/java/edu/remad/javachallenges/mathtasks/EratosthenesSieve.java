package edu.remad.javachallenges.mathtasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * filter with Eratosthenes's webb
 */
public class EratosthenesSieve {

  /** number to find prime numbers for */
  private final int number;

  /**
   * the numbers to filter for primes
   */
  private int[] numbersToFilter;

  /**
   * prime numbers found by webb
   */
  private final List<Integer> primeNumbers;

  /**
   * Constructs instance of {@link EratosthenesSieve}
   *
   * @param number number to find prime numbers for
   */
  public EratosthenesSieve(int number) {
    this.number = number;
    this.primeNumbers = new ArrayList<>();

    this.initNumbersToFilter();
  }

  /**
   * Initializes the numbers, which are to sieve
   */
  private void initNumbersToFilter() {
    this.numbersToFilter = new int[this.number];

    for(int i = 0; i < numbersToFilter.length; i++ ) {
      this.numbersToFilter[i] = i + 1;
    }
  }

  /**
   * Executes sieve of Eratosthenes.
   * @return prime numbers
   */
  public List<Integer> execute() {
    if(this.primeNumbers.isEmpty()) {
      int[] tempNumbers = Arrays.copyOf(this.numbersToFilter, numbersToFilter.length);
      List<Integer> result = new ArrayList<>(List.of(1));

      for (int i = 1; i < tempNumbers.length; i++) {
        if (tempNumbers[i] != 0) {
          int duplicate = tempNumbers[i];
          result.add(duplicate);

          for (int j = i + 1; j < tempNumbers.length; j++) {
            if (tempNumbers[j] != 0 && ((tempNumbers[j] % duplicate) == 0)) {
              tempNumbers[j] = 0;
            }
          }
        }
      }

      this.primeNumbers.addAll(result);
    }

      return new ArrayList<>(this.primeNumbers);
  }

  /**
   * Gets numbers to sieve
   *
   * @return the numbers to sieve
   */
  public int[] getNumbersToFilter() {
    return this.numbersToFilter;
  }
}
