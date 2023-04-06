package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter a word: ");
    String word1 = userInput.nextLine().toLowerCase().replaceAll(" ", "");

    System.out.println("Now enter one more word: ");
    String word2 = userInput.nextLine().toLowerCase().replaceAll(" ", "");

    userInput.close();
    if (word1.length() != word2.length()) {
      System.out.println(false);
      return;
    }

    char[] word1Chars = word1.toCharArray();
    char[] word2Chars = word2.toCharArray();
    Arrays.sort(word1Chars);
    Arrays.sort(word2Chars);

    boolean isAnagram = Arrays.equals(word1Chars, word2Chars);
    System.out.println(isAnagram);
  }
}

