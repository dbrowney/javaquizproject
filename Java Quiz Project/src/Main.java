// COP 2006 Integration Project - Summer A 2020
// Author: Donald Browney
/*
 * This is a quiz about Java programming language which can be used to help study for certification.
 */
// Coding help provided by COP 2006 lessons, W3Schools.com, and Oracle Java lessons unless otherwise
// noted.
// Built-In Data Types
// byte: whole number between -128 and 127, 8 bit
// int: whole number between -2^31 and 2^31-1, 32 bit
// long: whole number between -2^63 and 2^63-1, 64 bit
// short: whole number between -32,768 and 32,767, 16 bit
// float: decimal number, 32 bit, needs the letter f at the end
// double: decimal number, 64 bit, default decimal data type
// char: a single character or letter enclosed by single quotes, 16 bit
// boolean: only possible values are true and false, 1 bit of info

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    String quizQuestion1 = "JDK stands for Java Development Kit. ";
    String quizQuestion2 = "A variable is a location in memeory. ";
    // Scope means a variable is only accessible in the part of the program in which it was defined
    boolean correctAnswer1 = true;
    boolean correctAnswer2 = true;
    int numCorrect = 0; // numCorrect is a variable which is a location in memory
    final double POINTS_PER_CORRECT_ANSWER = 14.28571; // pointsPerCorrectAnswer is a final variable
                                                    // which means it's value is constant and cannot
                                                    // be changed

    System.out.println("Hello and welcome to JAVA QUIZ 1.0 - INITIAL SUCCESS OR TOTAL FAILURE");
    System.out.println(
        "This quiz is intended to sharpen your skills and bring you 1 step closer to certification.\n");
    System.out.println("Let's get started\n");
    System.out.print(quizQuestion1);
    System.out.println("Enter TRUE or FALSE"); // User Prompt
    Scanner scan = new Scanner(System.in); // used to gather user input to questions. not sure if
                                           // I'm supposed to close 'scan' out
    String answer1 = scan.nextLine();
    if (correctAnswer1 == Boolean.parseBoolean(answer1)) {
      // String to Boolean: https://www.java67.com/2018/03/java-convert-string-to-boolean.html
      System.out.println("Correct\n");
      numCorrect++;
    } else {
      System.out.println("Incorrect\n");
    }
    System.out.print(quizQuestion2);
    System.out.println("Enter TRUE or FALSE"); // User Prompt
    String answer2 = scan.nextLine();
    if (correctAnswer2 == Boolean.parseBoolean(answer2)) {
      // String to Boolean: https://www.java67.com/2018/03/java-convert-string-to-boolean.html
      System.out.println("Correct\n");
      numCorrect++;
    } else {
      System.out.println("Incorrect\n");
    }
    double totalPoints = numCorrect * POINTS_PER_CORRECT_ANSWER;
    System.out.println("Total Points: " + totalPoints);

  }

}
