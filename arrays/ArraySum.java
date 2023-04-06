package arrays;

public class ArraySum
{

  public static void main(String[] args)
  {
    double[] numbers = {-1, 10, 4.5, 15, 3.278};
    double sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("On index " + i + " we have " + numbers[i]);
      sum += numbers[i];
    }
    System.out.println("Sum is " + sum);
  }
}
