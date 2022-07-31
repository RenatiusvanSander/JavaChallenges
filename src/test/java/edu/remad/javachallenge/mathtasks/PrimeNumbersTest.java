package edu.remad.javachallenge.mathtasks;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import edu.remad.javachallenges.mathtasks.PrimeNumbers;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * JUnit test for {@link PrimeNumbers}
 */
public class PrimeNumbersTest {

  /**
   * Tests is prime.
   */
  @Test
  public void testIsPrime() {
    Boolean[] expectedIsPrime = new Boolean[]{true, true, true, false, true, false, true, false, false, false};

    Integer[] numbersToValidateForPrime = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    List<Boolean> actualValidatedPrimes = this.runIsPrimeInLoop(numbersToValidateForPrime);

    assertThat(actualValidatedPrimes, containsInAnyOrder(expectedIsPrime));
  }

  /**
   * Runs validation for prime numbers
   *
   * @param numbersToValidateForPrime numbers to be validated for prime number
   * @return list of true and false
   */
  private List<Boolean> runIsPrimeInLoop(Integer[] numbersToValidateForPrime) {
    List<Boolean> primeValidated = new ArrayList<>();

    for(int i = 0; i < numbersToValidateForPrime.length; i++) {
      boolean isPrime = PrimeNumbers.isPrime(numbersToValidateForPrime[i]);
      primeValidated.add(isPrime);
    }

    return primeValidated;
  }
}
