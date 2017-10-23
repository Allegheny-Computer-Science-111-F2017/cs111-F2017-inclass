/*
   Janyl Jumadinova
   October 29, 2014

Purpose: To determine whether a grade is a vowel (lower-case or upper-case)

*/

import java.util.Scanner;
public class ifElseDemoCap
{
  public static void main ( String args[] )
  {
    Scanner input = new Scanner ( System.in );
    System.out.print ( "Enter a character to test: " );
    char character;           // new data type: char
    character = input.next().charAt(0);       // get character from input
    if ((character == 'a') || (character == 'A'))     // notice ' ' marks char
      System.out.printf ( "%c is a vowel\n", character ); //notice %c
    else if ((character == 'e') || (character == 'E'))
      System.out.printf ( "%c is a vowel\n", character );
    else if ((character == 'i') || (character == 'I'))
      System.out.printf ( "%c is a vowel\n", character );
    else if ((character == 'o') || (character == 'O'))
      System.out.printf ( "%c is a vowel\n", character );
    else if ((character == 'u') || (character == 'U'))
      System.out.printf ( "%c is a vowel\n", character );
    else
      System.out.printf ( "%c is not a vowel\n", character );
  }
}

