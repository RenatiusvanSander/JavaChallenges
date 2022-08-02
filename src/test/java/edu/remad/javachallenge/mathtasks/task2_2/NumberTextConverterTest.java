package edu.remad.javachallenge.mathtasks.task2_2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.remad.javachallenges.mathtasks.task2_2.NumberTextConverter;
import org.junit.jupiter.api.Test;

/**
 * JUnit tests for {@link NumberTextConverter}
 */
public class NumberTextConverterTest {

  /**
   * Tests number for example six is as text returned.
   */
  @Test
  public void testNumberAsText() {
    String actualNumberAsText = NumberTextConverter.numberAsText(6);

    assertTrue(actualNumberAsText.equals("SIX"));
  }
}
