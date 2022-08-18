package edu.remad.javachallenge.mathtasks.task2_2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.remad.javachallenges.mathtasks.task2_2.CheckSum;
import org.junit.jupiter.api.Test;

/**
 * Junit tests for {@link CheckSum}
 */
public class CheckSumTest {

  /**
   * Tests calculates of checksum
   */
  @Test
  public void testCalcChecksum() {
    String number = "86455615316";

    int actualCheckSum = CheckSum.calcChecksum(number);

    assertEquals(289, actualCheckSum);
  }
}
