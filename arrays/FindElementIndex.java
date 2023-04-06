package arrays;

import java.util.Scanner;

public class FindElementIndex {

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int[] myArray = {1, 4, 6, 2, 10, 5};

    System.out.println("Please enter your number: ");
    int userChoice = input.nextInt();

    for (int i = 0; i < myArray.length; i++) {
      if (myArray[i] == userChoice) {
        System.out.println("The index of inserted number is: " + i);
        return;
      }
    }
    System.out.println("Such number not found!");
  }
}