import java.util.Scanner;

/** Determine whether or not a letter is a vowel.
 *
 * @author Janyl Jumadinova
 */
public class LowercaseVowelDetector {

  /**
   * Perform the detection of lowercase vowel detection.
   * Compile this program: javac LowercaseVowelDetector.java
   * Run this program: java LowercaseVowelDetector
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character to evaluate: ");

    char character;
    character = input.next().charAt(0);
    if (character == 'a') {
      System.out.printf("%c is a vowel\n", character);
    } else if (character == 'e') {
      System.out.printf("%c is a vowel\n", character);
    } else if (character == 'i') {
      System.out.printf("%c is a vowel\n", character);
    } else if (character == 'o') {
      System.out.printf("%c is a vowel\n", character);
    } else if (character == 'u') {
      System.out.printf("%c is a vowel\n", character);
    } else {
      System.out.printf("%c is not a lowercase vowel\n", character);
    }
  }
}
