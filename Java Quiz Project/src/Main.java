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

// Inheritance is the ability of a subclass (a.k.a. derived or child) to use the fields and methods
// of the superclass (a.k.a. base or parent)

// Some advantages of inheritance are the ability to reuse the same code for similar objects which
// cut down on program code length and help keep coding organized

// Polymorphism happens when a parent class reference is used to refer to a child class object

import java.util.Scanner;
import java.util.Random;

public class Main {
  static Scanner scan = new Scanner(System.in); // used to gather user input to questions; not sure
                                                // if it's supposed to be closed out

  public static void main(String[] args) {
    // VARIABLES
    Random randomDifficulty = new Random();
    String[] easyQuestions = {"\nJDK stands for Java Development Kit. (Enter TRUE or FALSE)",
        "A variable is a location in memeory. (Enter TRUE or FALSE)",
        "How many bits are in a byte?\na: 2\nb: 4\nc: 6\nd: 8"};
    String[] mediumQuestions = {
        "\nIn object oriented programming, an object comprises of properties and behaviors where "
            + "properties represented as fields of the object and behavior is represented as "
            + "method. (Enter TRUE or FALSE)",
        "Which of the following language is called a procedural language?\na: Java\nb: C\nc: Java "
            + "C\nd: C++",
        "A character preceded by backslash is called an escape sequence. (Enter TRUE or FALSE)"};
    String[] hardQuestions = {
        "\nThe Scanner class accepts input in which form?\na: Callables\nb: Future\nc: Tokens\nd: "
            + "Integer",
        "The classes of the Java class library are organized into packages. (Enter TRUE or FALSE)",
        "In the AND (&&) test, if the first expression on the left hand side is false, then there "
            + "is no need to evaluate the second statement. (Enter TRUE or FALSE)"};
    String[] easyAnswers = {"true", "true", "d"};
    String[] mediumAnswers = {"true", "b", "true"};
    String[] hardAnswers = {"c", "true", "true"};
    int numCorrect = 0; // numCorrect is a variable which is a location in memory
    final double POINTS_PER_CORRECT_ANSWER = 10.11111; // POINTS_PER_CORRECT_ANSWER is a final
                                                       // variable which means it's value is
                                                       // constant and cannot be changed
    boolean restartQuiz = true;
    String difficultyLevel;
    double totalPoints;
    String userInput;
    int autoDifficulty;
    double questionPoints = 0;
    double bonusPoints;
    char digit = '2';
    String userName;
    int firstLuckyNum = 0;
    int secondLuckyNum = 0;
    int thirdLuckyNum = 0;
    int tryAgain = 1;
    String[][] monthDay =
        {{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"},
            {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}};
    int month = 0;
    int day = 0;

    // INTRO
    System.out.println("Hello and welcome to JAVA QUIZ 1.0 - INITIAL SUCCESS OR TOTAL FAILURE");
    System.out
        .println("This quiz is intended to sharpen your skills and bring you 1 step closer to "
            + "certification.\n");
    System.out.println("First, please answer a few questions.\n");
    UserInfo name = new UserInfo();
    userName = scan.nextLine();
    name.setName(userName);
    while (tryAgain == 1) {
      System.out.println("\nNow give me 3 whole numbers between 2,147,483,647 and -2,147,483,648 "
          + "that you feel are lucky:");
      try {
        firstLuckyNum = scan.nextInt();
        secondLuckyNum = scan.nextInt();
        thirdLuckyNum = scan.nextInt();
        tryAgain = 2;
      } catch (Exception e) {
        System.out.println("You have not entered a valid number between 2,147,483,647 and "
            + "-2,147,483,648. Please try again!");
        scan.nextLine();
      }
    }
    UserInfo luckyNums = new UserInfo(firstLuckyNum, secondLuckyNum, thirdLuckyNum);
    System.out.println(luckyNums.getSmallestNumber());
    System.out.println(luckyNums.getTotalSum());
    System.out.println(luckyNums.getSmallestNumber(firstLuckyNum, secondLuckyNum));
    while (tryAgain == 2) {
      System.out.println("\nAnd last but not least, please quickly pick a number between 0 - 11:");
      try {
        month = scan.nextInt();
        System.out.println("Lastly, please quickly pick a number between 0 - 6:");
        day = scan.nextInt();
        tryAgain = 1;
      } catch (Exception e) {
        System.out.println("You have not entered a valid number. Please try again!");
        scan.nextLine();
      }
    }
    System.out.println("\nYour luckiest month and day are " + monthDay[0][month] + " and "
        + monthDay[1][day] + ".");
    scan.nextLine();

    // QUIZ
    do {
      System.out.println("\nNow please tell me the difficulty level you would like to try by "
          + "entering the corresponding number.\n");
      System.out.println("1: Easy");
      System.out.println("2: Medium");
      System.out.println("3: Hard");
      difficultyLevel = scan.nextLine();
      switch (difficultyLevel) {
        case "1":
          numCorrect = askQuestions(easyQuestions, easyAnswers);
          // the value of numCorrect is a method call with the arguments in ()
          break;
        case "2":
          numCorrect = askQuestions(mediumQuestions, mediumAnswers);
          break;
        case "3":
          numCorrect = askQuestions(hardQuestions, hardAnswers);
          break;
        default:
          autoDifficulty = randomDifficulty.nextInt(3) + 1;
          System.out
              .println("That is not a valid choice. Difficulty randomly set to: " + autoDifficulty);
          if (autoDifficulty == 1) {
            // == evaluates condition as a boolean to see if it's true or false
            numCorrect = askQuestions(easyQuestions, easyAnswers);
          } else if (autoDifficulty == 2) {
            numCorrect = askQuestions(mediumQuestions, mediumAnswers);
          } else {
            numCorrect = askQuestions(hardQuestions, hardAnswers);
          }
      }

      // QUIZ SCORE
      for (int score = 0; score <= 3; score++) {
        questionPoints = numCorrect * (POINTS_PER_CORRECT_ANSWER - 0.11111);
      }
      // the continue statement breaks 1 iteration of the loop if a condition is met and then
      // continues on to the next iteration
      // System.out.println(questionPoints); Used for testing purposes
      bonusPoints = (questionPoints) % 2;
      bonusPoints--;
      // System.out.println(bonusPoints); Used for testing purposes
      totalPoints = questionPoints * 3 + Math.pow(bonusPoints, (int) digit) / 0.1;
      // the char variable "digit" was cast (converted) into an integer variable
      // operator precedence starts with postfix, unary, multiplicative, additive, shift (<<, >>,
      // >>>), relational, equality, bitwise AND (&), bitwise exclusive OR (^), bitwise inclusive OR
      // (|), logical AND (&&), logical OR (||), ternary, assignment
      System.out.printf("%s%f", "Total Points: ", totalPoints);

      // RESTART QUIZ
      System.out.println("\nWould you like to take the quiz again? (Enter true or false)");
      userInput = scan.nextLine();
      restartQuiz = userInput.equalsIgnoreCase("true") ? true : false;
    } while (restartQuiz);
    System.out.println("Thank you for taking my quiz and Good Luck on getting your certification!");
  }

  public static int askQuestions(String[] questions, String[] answers) {
    // above is a method header with the parameters in the ()
    int counter = 0; // Scope means a variable is only accessible in the part of the program in
                     // which it was defined
    int numCorrect = 0;
    while (counter <= questions.length - 1) {
      System.out.println(questions[counter]);
      String userAnswer = scan.nextLine();
      if (userAnswer.equalsIgnoreCase(answers[counter])) {
        System.out.println("Correct\n");
        numCorrect += 1;
      } else {
        System.out.println("Incorrect\n");
      }
      counter += 1;
    }
    return numCorrect;
  }
}
