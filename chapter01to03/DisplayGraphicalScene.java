import java.util.Date;
import javax.swing.*;

/**
 * This class produces simple graphical output.
 * The program will display a small grapical scene.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 */

public class DisplayGraphicalScene {

  /**
   * This is the main method that constructs the DrawingCanvas.
   * This method will set the size of the canvas and then
   * use the DrawingCanvas class to paint a scene on the screen.
   */
  public static void main(String[] args) {
    JFrame window = new JFrame("Gregory M. Kapfhammer " + new Date());
    // Add the drawing canvas and do necessary things to
    // make the window appear on the screen
    window.getContentPane().add(new DrawingCanvas());
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.setSize(600, 400);
  }
}

