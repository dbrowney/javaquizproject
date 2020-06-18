// Author: Donald Browney
// This class is used to find the smallest number and total sum of a set of user entered integers.

import java.util.ArrayList;

/**
 * This is an object class that finds the largest and smallest numbers from a set of numbers.
 * 
 * @author Donald Browney
 */
public class UserInfo {
  private int num1;
  private int num2;
  private int num3;
  private int num4;
  private int num5;
  private int smallestNum;
  private int largestNum;
  private int index;
  private int totalSum;
  private String name;

  /**
   * This is the default constructor.
   */
  public UserInfo() {
    System.out.println("What is your name?");
  }

  /**
   * This is the constructor used if the values of the three numbers are already known.
   * 
   * @param firstNum enter a whole number (integer)
   * @param secondNum enter a whole number (integer)
   * @param thirdNum enter a whole number (integer)
   */
  public UserInfo(int firstNum, int secondNum, int thirdNum) {
    num1 = firstNum;
    num2 = secondNum;
    num3 = thirdNum;
  }

  /**
   * This is a setter method which sets the input value as the user's name.
   * 
   * @param nameEntered enter name as text
   */
  public void setName(String nameEntered) {
    name = nameEntered;
  }

  /**
   * This is a setter method which sets 3 numbers to the corresponding class fields.
   * 
   * @param firstNum enter a whole number (integer)
   * @param secondNum enter a whole number (integer)
   * @param thirdNum enter a whole number (integer)
   */
  public void setNumbers(int firstNum, int secondNum, int thirdNum) {
    num1 = firstNum;
    num2 = secondNum;
    num3 = thirdNum;
  }

  /**
   * This is a setter method which sets 2 numbers to the corresponding class fields.
   * 
   * @param firstNum enter a whole number (integer)
   * @param secondNum enter a whole number (integer)
   */
  public void setNumbers(int firstNum, int secondNum) {
    num4 = firstNum;
    num5 = secondNum;
  }

  /**
   * This is a getter method which calculates the smallest number out of three whole numbers.
   * 
   * @return text message stating the smallest number and its index position
   */
  public String getSmallestNumber() {
    int[] numbers = {num1, num2, num3};
    smallestNum = num1;
    index = 0;
    for (int num : numbers) {
      if (num < smallestNum) {
        smallestNum = num;
        if (smallestNum == num1) {
          index = 0;
        } else if (smallestNum == num2) {
          index = 1;
        } else {
          index = 2;
        }
      }
    }
    return "\nThe smallest lucky number out of " + name + "'s lucky numbers is " + smallestNum
        + " which was at index position " + index + ".";
  }

  /**
   * This is a getter method which calculates the largest number out of two whole numbers.
   * 
   * @return largest number as an integer
   */
  public int getLargestNumber() {
    if (num4 > num5) {
      largestNum = num4;
    } else {
      largestNum = num5;
    }
    return largestNum;
  }

  /**
   * This is a getter method which calculates the sum of three whole numbers.
   * 
   * @return text message stating the sum
   */
  public String getTotalSum() {
    ArrayList<Integer> numList = new ArrayList<Integer>();
    numList.add(num1);
    numList.add(num2);
    numList.add(num3);
    totalSum = 0;
    for (int num : numList) {
      totalSum += num;
    }
    return "The total of all of " + name + "'s lucky numbers is " + totalSum + ".";
  }
}
