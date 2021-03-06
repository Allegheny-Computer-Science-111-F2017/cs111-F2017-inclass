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
public class ComputeGasMileage {

  /**
   * Demonstrate the use of the Scanner class to read user input.
   * Compile this program: javac ComputeGasMileage.java
   * Run this program: java ComputeGasMileage
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int miles;
    System.out.print("Enter the number of miles: ");
    miles = scan.nextInt();

    double gallons;
    System.out.print("Enter the gallons of fuel used: ");
    gallons = scan.nextDouble();

    double mpg;
    mpg = miles / gallons;

    System.out.println("Miles Per Gallon: " + mpg);
  }
}
