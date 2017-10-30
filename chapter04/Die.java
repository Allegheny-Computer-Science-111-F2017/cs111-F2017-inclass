/**
 * This class represents one die (singular of dice) with faces showing
 * values between one and six.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 */
public class Die {
  private static final int MAX = 6;
  private int faceValue;

  /** Constructor: Sets the initial face value. */
  public Die() {
    faceValue = 1;
  }

  /** Rolls the die and returns the result. */
  public int roll() {
    faceValue = (int)(Math.random() * MAX) + 1;
    return faceValue;
  }

  /** Face value mutator. */
  public void setFaceValue(int value) {
    faceValue = value;
  }

  /** Face value accessor. */
  public int getFaceValue() {
    return faceValue;
  }

  /** Returns a string representation of this die. */
  public String toString() {
    String result = Integer.toString(faceValue);
    return result;
  }
}
