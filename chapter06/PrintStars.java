/** Display a triangle shape using the "star" characters.
 *
 * @author Lewis and Loftus
 */

public class PrintStars {

  private static final int MAX_ROWS = 10;

  /** Prints a triangle shape using asterisk (star) characters. */
  public static void main(String[] args) {

    for (int row = 1; row <= MAX_ROWS; row++) {
      for (int star = 1; star <= row; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
