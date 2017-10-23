/*
   Janyl Jumadinova
   October 29, 2014

Purpose: To determine whether a grade is a vowel

*/

import java.util.Scanner;
public class ifElseDemo
{
  public static void main ( String args[] )
  {
    Scanner input = new Scanner ( System.in );
    System.out.print ( "Enter a character to test: " );
    char character;            // new data type: char
    character = input.next().charAt(0); // get character from input
    if (character == 'a')             // notice ' ' marks char
      System.out.printf ( "%c is a vowel\n", character ); //notice %c
    else if (character == 'e')
      System.out.printf ( "%c is a vowel\n", character );
    else if (character == 'i')
      System.out.printf ( "%c is a vowel\n", character );
    else if (character == 'o')
      System.out.printf ( "%c is a vowel\n", character );
    else if (character == 'u')
      System.out.printf ( "%c is a vowel\n", character );
    else
      System.out.printf ( "%c is not a vowel\n", character );
  }
}

