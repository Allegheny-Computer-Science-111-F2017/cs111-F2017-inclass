import java.util.ArrayList;
import java.util.Collections;

/**
 * Demonstrates the use of an ArrayList and the shuffle method.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Kapfhammer
 */
public class Shuffler {

  /**
   * Demonstrate the use of shuffled ArrayLists.
   * Compile this program: javac Shuffler.java
   * Run this program: java Shuffler
   */
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int loopCounter = 0;
    while (loopCounter < 10) {
      list.add(loopCounter);
      loopCounter++;
    }
    System.out.println("Starting list: " + list);
    Collections.shuffle(list);
    System.out.println("Shuffled list: " + list);
  }
}
