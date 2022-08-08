package edu.remad.javachallenge.mathtasks.task2_2;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.remad.javachallenges.mathtasks.task2_2.PerfectNumber;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * JUnit tests for {@link PerfectNumber}
 */
public class PerfectNumbersTest {

  /**
   * Tests calculation of perfect numbers for 1000.
   */
  @Test
  public void testPerfectNumbers() {
    List<Integer> actualPerfectNumbers = PerfectNumber.calcPerfectNumbers(1000);

    assertThat(actualPerfectNumbers, containsInAnyOrder(6,28,496));
  }

  /**
   * Tests is a perfect number parametrized.
   *
   * @param value number range to validate is perfect number.
   */
  @ParameterizedTest(name = "{0} should be perfect")
  @ValueSource(ints = {6, 28, 496, 8128})
  public void isPerfectNumberSimple(int value) {
    boolean result = PerfectNumber.isPerfectNumberSimple(value);

    assertTrue(result);
  }
}
