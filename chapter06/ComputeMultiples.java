import java.util.Scanner;

/**
 * This class has a method that accepts numerical user input and then calculates
 * and displays the multiples of that numerical value.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 */
public class ComputeMultiples {

  private static final int PER_LINE = 5;

  /**
   * Read in a numerical value and complete the multiples of it.
   * Compile this program: javac ComputeMultiples.java
   * Run this program: java ComputeMultiples
   */
  public static void main(String[] args) {
    int value;
    int count = 0;

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a positive value: ");
    value = scan.nextInt();

    int limit;
    System.out.print("Enter an upper limit: ");
    limit = scan.nextInt();

    System.out.println();
    System.out.println("The multiples of " + value + " between "
                       + value + " and " + limit + " (inclusive) are:");

    int mult;
    for (mult = value; mult <= limit; mult += value) {
      System.out.print(mult + "\t");

      // Print a specific number of values per line of output
      count++;
      if (count % PER_LINE == 0) {
        System.out.println();
      }
    }
  }
}
