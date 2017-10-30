public class Hooray {

  /**
   * Demonstrates the use of an infinite while loop.
   *
   * <p>Bugs: This program has a known bug.
   *
   * @author Kapfhammer
   */
  public static void hooray() {
    while (true) {
      System.out.println("Hooray!");
    }
  }

  /**
   * Demonstrates the calling of a method with a loop.
   * Compile this program: javac Hooray.java
   * Run this program: java Hooray
   * Remember, this program runs infinitely.
   * To stop it from running, press CTRL-c in terminal.
   */
  public static void main(String[] args) {
    hooray();
  }

}
