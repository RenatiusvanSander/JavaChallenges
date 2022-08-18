package edu.remad.javachallenge.mathtasks.task2_2;

import static junit.framework.TestCase.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.equalTo;

import edu.remad.javachallenges.mathtasks.task2_2.PrimePairs;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

/**
 * JUnit tests for {@link PrimePairs}
 */
public class PrimePairsTest {

  /**
   * Tests prime apirs for number 50.
   */
  @Test
  public void testPrimePairs() {
    List<Map<Integer, Integer>> actualPairs = PrimePairs.calculatePairs(50);

    assertThat(actualPairs.get(0), hasEntry(equalTo(3), equalTo(5)));
    assertThat(actualPairs.get(1), hasEntry(equalTo(3), equalTo(7)));
    assertThat(actualPairs.get(2), hasEntry(equalTo(5), equalTo(11)));
  }
}
