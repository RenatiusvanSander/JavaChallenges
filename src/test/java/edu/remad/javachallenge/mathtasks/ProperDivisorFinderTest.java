package edu.remad.javachallenge.mathtasks;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import edu.remad.javachallenges.mathtasks.ProperDivisorFinder;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * JUnit test for {@link ProperDivisorFinder}
 */
public class ProperDivisorFinderTest {

  /**
   * Tests find divisors for 100.
   */
  @Test
  public void testFindProperDivisorsShouldContainExpectedDivisors() {
    Integer[] expectedDivisors = new Integer[]{1, 2, 4, 5, 10, 20, 25, 50};

    int numberToFindDivisors = 100;
    List<Integer> actualDivisors = ProperDivisorFinder.findProperDivisors(numberToFindDivisors);

    assertThat(actualDivisors, containsInAnyOrder(expectedDivisors));
  }
}
