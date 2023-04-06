package arrays;

import java.util.Scanner;

public class Score
{

  public static void main(String[] args)
  {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Please enter the number of players: ");
      System.out.println();
      int numberPlayers = Integer.parseInt(input.nextLine());
      double slowest = Double.MIN_VALUE;
      double fastest = Double.MAX_VALUE;
      double sumSeconds = 0;
      double averageScore = 0;
      double standardDeviation1 = 0;
      double[] playersScore = new double[numberPlayers];

      for (int i = 0; i < playersScore.length; i++) {
        System.out.printf("Enter score for player Nr.%d: \n", i + 1);
        playersScore[i] = Double.parseDouble(input.nextLine());
        sumSeconds += playersScore[i];

        if (playersScore[i] > slowest) {
          slowest = playersScore[i];
        }
        if (playersScore[i] < fastest) {
          fastest = playersScore[i];
        }
      }
      averageScore = sumSeconds / numberPlayers;
      for (int i = 0; i < playersScore.length; i++) {
        standardDeviation1 += Math.pow(playersScore[i] - averageScore, 2);
      }

      System.out.printf("Minimum score: %.3f\n", fastest);
      System.out.printf("Maximum score: %.3f\n", slowest);
      System.out.printf("Average score: %.3f\n", averageScore);
      System.out.printf("Standard deviation: %.3f\n", Math.sqrt(standardDeviation1 / numberPlayers));
    }
    catch (NumberFormatException e) {
      System.err.println("Invalid input. Please enter a valid number.");
    }
  }
}
