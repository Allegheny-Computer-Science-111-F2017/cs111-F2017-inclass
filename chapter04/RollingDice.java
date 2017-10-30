/**
 * Demonstrates the creation and use of a user-defined class.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 */
public class RollingDice {

  /**
   * Demonstrate the use of creating and using objects.
   * Compile this program: javac RollingDice.java
   * Run this program: java RollingDice
   */
  public static void main(String[] args) {
    Die die1;
    Die die2;

    die1 = new Die();
    die2 = new Die();

    die1.roll();
    die2.roll();
    System.out.println("Die One: " + die1 + ", Die Two: " + die2);

    die1.roll();
    die2.setFaceValue(4);
    System.out.println("Die One: " + die1 + ", Die Two: " + die2);

    int sum;
    sum = die1.getFaceValue() + die2.getFaceValue();
    System.out.println("Sum: " + sum);

    sum = die1.roll() + die2.roll();
    System.out.println("Die One: " + die1 + ", Die Two: " + die2);
    System.out.println("New sum: " + sum);
  }
}
