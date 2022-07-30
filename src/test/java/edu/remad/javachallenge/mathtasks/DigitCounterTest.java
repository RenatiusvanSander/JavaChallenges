package edu.remad.javachallenge.mathtasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.remad.javachallenges.mathtasks.DigitCounter;
import org.junit.jupiter.api.Test;

/**
 * JUnit tests for {@link DigitCounter}
 */
public class DigitCounterTest {

  /**
   * Test counted digits is 4 for number of 1000.
   */
  @Test
  public void testCountedDigitIs4() {
    int expectedCountedDigits = 4;

    int number = 1000;
    int actualCountedDigits = DigitCounter.countDigits(number);

    assertEquals(expectedCountedDigits, actualCountedDigits,
        "Counted digits have to be " + expectedCountedDigits);
  }
}
