package edu.remad.javachallenge.mathtasks;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import edu.remad.javachallenges.mathtasks.EratosthenesSieve;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

/**
 * JUnit tests for {@link EratosthenesSieve}
 */
public class EratosthenesSieveTest {

  /**
   * Tests number s are initialized for 10.
   */
  @Test
  public void testNumbersAreInitialized() {
    Integer[] expectedNumbers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    EratosthenesSieve filter = new EratosthenesSieve(10);
    List<Integer> actualNumbers = Arrays.stream(filter.getNumbersToFilter()).boxed().collect(
        Collectors.toList());

    assertThat(actualNumbers, org.hamcrest.Matchers.containsInAnyOrder(expectedNumbers));
  }

  /**
   * Tests execute, which processes prime numbers by Eratosthenes's webb.
   */
  @Test
  public void testExecute() {
    EratosthenesSieve filter = new EratosthenesSieve(10);
    filter.execute();

    fail();
  }
}
