package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquals {

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int[] myArray = {1, 10, 15}; // we have given values for the first array, hidden from user
    System.out.println("Please enter your numbers: ");
    int[] userArray = new int[3]; // now we need another array to be filled by the user

    for (int i = 0; i < userArray.length; i++) {
      userArray[i] = userInput.nextInt(); // read input directly as integer
    }

    Arrays.sort(userArray);

    if (Arrays.equals(myArray, userArray)) { // here we check if both arrays are equal
      System.out.println("Yes, both arrays are equal.");
    } else {
      System.out.println("Arrays are different.");
    }

    userInput.close(); // close the scanner
  }
}


