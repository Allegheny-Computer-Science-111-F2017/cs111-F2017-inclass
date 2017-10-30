//********************************************************************
//  Average.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a while loop, a sentinel value, and a
//  running sum.
//********************************************************************

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Demonstrates the use of a while loop, a sentinel value, and a running sum.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 */
public class Average {

  /** Computes the average of a set of values entered by the user.
   * The running sum is printed as the numbers are entered. */
  public static void main(String[] args) {
    int sum = 0;
    int value;
    int count = 0;
    double average;

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter an integer (0 to quit): ");
    value = scan.nextInt();

    // use a sentinel value of 0 to terminate the loop
    while (value != 0) {
      count++;
      sum += value;
      System.out.println("The sum so far is " + sum);
      System.out.print("Enter an integer (0 to quit): ");
      value = scan.nextInt();
    }

    System.out.println();

    if (count == 0) {
      System.out.println("No values were entered.");
    } else {
      average = (double)sum / count;
      DecimalFormat fmt = new DecimalFormat("0.###");
      System.out.println("The average is " + fmt.format(average));
    }
  }
}
