import java.util.Scanner;

/** Determine whether or not a letter is a vowel.
 *
 * @author Janyl Jumadinova
 */
public class CapitalizedVowelDetector {

  /**
   * Perform the detection of capitalized vowel detection.
   * Compile this program: javac CapitalizedVowelDetector.java
   * Run this program: java CapitalizedVowelDetector
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character to evaluate: ");

    char character;
    character = input.next().charAt(0);
    if (character == 'A') {
      System.out.printf("%c is a vowel\n", character);
    } else if (character == 'E') {
      System.out.printf("%c is a vowel\n", character);
    } else if (character == 'I') {
      System.out.printf("%c is a vowel\n", character);
    } else if (character == 'O') {
      System.out.printf("%c is a vowel\n", character);
    } else if (character == 'U') {
      System.out.printf("%c is a vowel\n", character);
    } else {
      System.out.printf("%c is not a capitalized vowel\n", character);
    }
  }
}

