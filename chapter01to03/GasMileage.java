import java.util.Scanner;

/**
 * This class has a method that accepts user input and displays it as output.
 * The program will make a prompt, accept input and then make another prompt
 * and accept input another time. This program can calculate gas mileage.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 */

public class GasMileage {

  /**
   * Demonstrate the use of the Scanner class to read user input.
   * Compile this program: javac GasMileage.java
   * Run this program: java GasMileage
   */
  public static void main(String[] args) {
    int miles;
    double gallons;
    double mpg;

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the number of miles: ");
    miles = scan.nextInt();

    System.out.print("Enter the gallons of fuel used: ");
    gallons = scan.nextDouble();

    mpg = miles / gallons;

    System.out.println("Miles Per Gallon: " + mpg);
  }
}
