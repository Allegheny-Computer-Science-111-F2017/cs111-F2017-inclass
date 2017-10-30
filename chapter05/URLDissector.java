//********************************************************************
//  URLDissector.java       Author: Lewis/Loftus
//
//  Demonstrates the use of Scanner to read file input and parse it
//  using alternative delimiters.
//********************************************************************

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/** Demonstrates the use of the java.util.Scanner class to read file input and
 * to parse it using some alternative delimiters.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Lewis and Loftus
 */
public class URLDissector {

  /**
   * Demonstrates the use of the Scanner class to read input from a file.
   * Compile this program: javac URLDissector.java
   * Run this program: java URLDissector
   */
  public static void main(String[] args) throws IOException {
    String url;
    Scanner fileScan;
    Scanner urlScan;
    fileScan = new Scanner(new File("urls.inp"));

    // read and process each line of the file
    while (fileScan.hasNext()) {
      url = fileScan.nextLine();
      System.out.println("URL: " + url);

      urlScan = new Scanner(url);
      urlScan.useDelimiter("/");

      // print each part of the url
      while (urlScan.hasNext()) {
        System.out.println("   " + urlScan.next());
      }
      System.out.println();
    }
  }
}
