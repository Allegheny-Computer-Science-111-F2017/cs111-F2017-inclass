//==========================================
// Gregory M. Kapfhammer
// Janyl Jumadinova
// Class Exercise
// September 24, 2014
//
// Purpose: This program sets up a window with a "drawing
// canvas". To add things to the drawing, you must
// edit the file "DrawingCanvas.java".
//==========================================

import javax.swing.*;
import java.util.Date;

public class DrawingTest {

    public static void main(String[] args) {
        JFrame window = new JFrame("Gregory M. Kapfhammer " + new Date());
        // Add the drawing canvas and do necessary things to
        // make the window appear on the screen!
        window.getContentPane().add(new DrawingCanvas());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setSize(600, 400);
    }
}

