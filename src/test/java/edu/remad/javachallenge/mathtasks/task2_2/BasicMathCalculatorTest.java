package edu.remad.javachallenge.mathtasks.task2_2;

import static org.junit.Assert.assertEquals;

import edu.remad.javachallenges.mathtasks.task2_2.BasicMathCalculator;
import org.junit.jupiter.api.Test;

/**
 * Junit test for {@link BasicMathCalculator]}
 */
public class BasicMathCalculatorTest {

  /**
   * Tests calc returns 6.
   */
  @Test
  public void testCalcShouldReturn6() {
    BasicMathCalculator calc = new BasicMathCalculator();
    int actualRest = calc.calc(10, 4);

    assertEquals(6, actualRest);
  }
}
