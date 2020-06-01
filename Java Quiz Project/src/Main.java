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
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    // VARIABLES
    Scanner scan = new Scanner(System.in); // used to gather user input to questions. not sure if
    // I'm supposed to close 'scan' out
    Random randomDifficulty = new Random();
    String[] easyQuestions = {"JDK stands for Java Development Kit. (Enter TRUE or FALSE)",
        "A variable is a location in memeory. (Enter TRUE or FALSE)",
        "How many bits are in a byte?\na: 2\nb: 4\nc: 6\nd: 8"};
    String[] mediumQuestions = {
        "In object oriented programming, an object comprises of properties and behaviors where "
            + "properties represented as fields of the object and behavior is represented as method. "
            + "(Enter TRUE or FALSE)",
        "Which of the following language is called a procedural language?\na: Java\nb: C\nc: Java "
            + "C\nd: C++",
        "A character preceded by backslash is called an escape sequence. (Enter TRUE or FALSE)"};
    String[] hardQuestions = {
        "The Scanner class accepts input in which form?\na: Callables\nb: Future\nc: Tokens\nd: "
            + "Integer",
        "The classes of the Java class library are organized into packages. (Enter TRUE or FALSE)",
        "In the AND (&&) test, if the first expression on the left hand side is false, then there "
            + "is no need to evaluate the second statement. (Enter TRUE or FALSE)"};
    String[] easyAnswers = {"true", "true", "d"};
    String[] mediumAnswers = {"true", "b", "true"};
    String[] hardAnswers = {"c", "true", "true"};
    // Scope means a variable is only accessible in the part of the program in which it was defined
    int numCorrect = 0; // numCorrect is a variable which is a location in memory
    final double POINTS_PER_CORRECT_ANSWER = 14.28571; // POINTS_PER_CORRECT_ANSWER is a final
                                                       // variable which means it's value is
                                                       // constant and cannot be changed
    boolean restartQuiz = true;
    int difficultyLevel;
    int counter;
    double totalPoints;
    String userInput;

    // INTRO
    System.out.println("Hello and welcome to JAVA QUIZ 1.0 - INITIAL SUCCESS OR TOTAL FAILURE");
    System.out.println(
        "This quiz is intended to sharpen your skills and bring you 1 step closer to certification.\n");

    // QUIZ
    do {
      counter = 0;
      System.out
          .println("To get started, please tell me the difficulty level you would like to try.\n");
      System.out.println("1: Easy");
      System.out.println("2: Medium");
      System.out.println("3: Hard");
      difficultyLevel = scan.nextInt();
      scan.nextLine();
      switch (difficultyLevel) {
        case 1:
          while (counter <= easyQuestions.length - 1) {
            System.out.println(easyQuestions[counter]);
            String userAnswer = scan.nextLine();
            if (userAnswer.equalsIgnoreCase(easyAnswers[counter])) {
              System.out.println("Correct\n");
              numCorrect += 1;
            } else {
              System.out.println("Incorrect\n");
            }
            counter += 1;
          }
          break;
        case 2:
          while (counter <= mediumQuestions.length - 1) {
            System.out.println(mediumQuestions[counter]);
            String userAnswer = scan.nextLine();
            if (userAnswer.equalsIgnoreCase(mediumAnswers[counter])) {
              System.out.println("Correct\n");
              numCorrect += 1;
            } else {
              System.out.println("Incorrect\n");
            }
            counter += 1;
          }
          break;
        case 3:
          while (counter <= hardQuestions.length - 1) {
            System.out.println(hardQuestions[counter]);
            String userAnswer = scan.nextLine();
            if (userAnswer.equalsIgnoreCase(hardAnswers[counter])) {
              System.out.println("Correct\n");
              numCorrect += 1;
            } else {
              System.out.println("Incorrect\n");
            }
            counter += 1;
          }
          break;
        default:
          System.out.println("random");
      }

      // QUIZ SCORE
      totalPoints = numCorrect * POINTS_PER_CORRECT_ANSWER;
      System.out.printf("%s%f", "Total Points: ", totalPoints);

      // RESTART QUIZ
      System.out.println("\nWould you like to take the quiz again? (Enter true or false)");
      userInput = scan.nextLine();
      if (userInput.equalsIgnoreCase("true")) {
        restartQuiz = true;
      } else {
        restartQuiz = false;
      }
    } while (restartQuiz == true);
    System.out.println("Thank you for taking my quiz and Good Luck on getting your certification!");
  }
}
