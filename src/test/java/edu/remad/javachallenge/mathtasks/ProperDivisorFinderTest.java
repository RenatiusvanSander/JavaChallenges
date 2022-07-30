package edu.remad.javachallenge.mathtasks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.remad.javachallenges.mathtasks.ProperDivisorFinder;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ProperDivisorFinderTest {

  @Test
  public void testFindProperDivisors() {
    int numberValue = 100;

    List<Integer> actualDivisors = ProperDivisorFinder.findProperDivisors(numberValue);

    assertEquals(8, actualDivisors.size(), "");
  }
}
