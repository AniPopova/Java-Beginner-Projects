package arrays;

import java.util.Scanner;

public class ScoreRedaction {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of players: ");
    int numberPlayers = Integer.parseInt(input.nextLine());
    double fastest = Double.MAX_VALUE;
    double slowest = Double.MIN_VALUE;
    double sumSeconds = 0;
    double averageScore = 0;
    double standardDeviation1 = 0;
    double[] playersScore = new double[numberPlayers];

    for (int i = 0; i < playersScore.length; i++) {
      System.out.printf("Enter score for player Nr%d: ", i, "\n");
      playersScore[i]  = Double.parseDouble(input.nextLine());
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
      standardDeviation1 += Math.pow(playersScore[i]-averageScore,2);
    }

    System.out.printf("Min      = %.3f\n", fastest);
    System.out.printf("Max      = %.3f\n", slowest);
    System.out.printf("Average  = %.3f\n", averageScore);
    System.out.printf("StdDev   = %.3f\n", Math.sqrt(standardDeviation1/numberPlayers));
  }
}

