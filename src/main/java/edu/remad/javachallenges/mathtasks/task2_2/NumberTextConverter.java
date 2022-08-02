package edu.remad.javachallenges.mathtasks.task2_2;

public class NumberTextConverter {

  public static String numberAsText(final int n) {
    final int remainder = n % 10;
    String numberAsText = "";

    switch(remainder) {
      case 0: {
        numberAsText = "NULL";
        break;
      }
      case 1: {
        numberAsText = "ONE";
        break;
      }
      case 2: {
        numberAsText = "TWO";
        break;
      }
      case 3: {
        numberAsText = "THREE";
        break;
      }
      case 4: {
        numberAsText = "FOUR";
        break;
      }
      case 5: {
        numberAsText = "FIVE";
        break;
      }
      case 6: {
        numberAsText = "SIX";
        break;
      }
      case 7: {
        numberAsText = "SEVEN";
        break;
      }
      case 8: {
        numberAsText = "EIGHT";
        break;
      }
      case 9: {
        numberAsText = "NINE";
        break;
      }
    }

    return numberAsText;
  }

}
