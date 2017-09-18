import java.util.*;
import java.text.*;

/**
 *  Compilation:  javac LogisticMap.java
 *  Execution:    java LogisticMap 0 or
 *                java LogisticMap (number from previous output)
 *
 *  Plot the bifurcation diagram of the logistic map. The logistic
 *  is: x[n+1] = 4 r x[n](1 - x[n]). For each value of r, discard
 *  the first 1000 iterates x[n], then plot the next 100.
 *
 */

public class LogisticMap {

  /**
   * This is function that is iteratively computed and displayed.
   */
  static double logistic(double y, double r) {
    return 4.0 * r * y * (1.0 - y);
  }

 /**
   * This is the main method that iteratively computes and displays.
   * Notice that this method displays graphics at the pixel-by-pixel level
   * instead of using other methods that can draw and entire shape.
   */
  public static void main(String[] args) {

    // store the values
    ArrayList values = new ArrayList();

    // Number of iterations
    int N = 800;

    // grab a value so that we can output certain scores
    Double rchosenFirst = new Double(args[0]);
    double rchosen = rchosenFirst.doubleValue();

    // old approach to draw the map
    StdDraw.setXscale(0.7, 1.0);
    StdDraw.setYscale(0.0, 1.0);

    // shows how to put the "origin" into the graph
    StdDraw.text(.7,0,".7");
    StdDraw.show(10);

    // draw the entire bifurcation map
    for (double r = 0.7; r <= 1.0; r += 0.3/N) {

      // choose random initial value
      double y = Math.random();

      // ignore first 1000 iterates
      for (int i = 0; i < 1000; i++)
        y = logistic(y, r);

      // reinitialize the array that will store the values
      values = new ArrayList();

      // plot next 100 iterates
      for (int i = 0; i < 100; i++) {

        // call the function again and then plot these
        // points on the graphical interface using the
        // StdDraw package -- using (r,y) points
        y = logistic(y, r);
        StdDraw.point(r, y);

        // add all of the values for
        // the command-line argument
        if( rchosen == roundSixDecimals(r) ) {
          values.add(y);
        }
      }

      // display for 10 time units and then move on
      StdDraw.show(10);

      // print some of the the debugging output so that we
      // can check for a pattern in the output
      if( rchosen == roundSixDecimals(r) ) {
        System.out.println("r = " + rchosen);
        System.out.println(values.toString());
      }

      // print all of the values for debugging purposes
      // note that this will produce a substantial amount
      // of output in the terminal window of your program!
      if( rchosen == 0 ) {
        System.out.println("r = " + r);
      }
    }
  }

  /**
   * Round the number of decimals so that output is easier to read.
   */
  public static double roundSixDecimals(double d) {
    DecimalFormat sixDForm = new DecimalFormat("#.######");
    return Double.valueOf(sixDForm.format(d));
  }

}

