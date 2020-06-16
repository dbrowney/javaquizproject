import java.util.ArrayList;

public class UserInfo {
  private int num1;
  private int num2;
  private int num3;
  private int smallestNum;
  private int index;
  private int totalSum;
  private static String name;

  public UserInfo() {
    System.out.println("What is your name?");
  }

  public UserInfo(int firstNum, int secondNum, int thirdNum) {
    num1 = firstNum;
    num2 = secondNum;
    num3 = thirdNum;
  }

  public void setName(String userName) {
    name = userName;
  }

  public static String getName() {
    return name;
  }

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
    return "\nThe smallest lucky number out of " + UserInfo.getName() + "'s lucky numbers is "
        + smallestNum + " which was at index position " + index + ".";
  }

  public String getSmallestNumber(int num1, int num2) {
    if (num1 < num2) {
      smallestNum = num1;
    } else {
      smallestNum = num2;
    }
    return "The smallest lucky number out of " + UserInfo.getName() + "'s first two numbers is "
        + smallestNum + ".";
  }

  public String getTotalSum() {
    ArrayList<Integer> numList = new ArrayList<Integer>();
    numList.add(num1);
    numList.add(num2);
    numList.add(num3);
    totalSum = 0;
    for (int num : numList) {
      totalSum += num;
    }
    return "The total of all of " + UserInfo.getName() + "'s lucky numbers is " + totalSum + ".";
  }
}
