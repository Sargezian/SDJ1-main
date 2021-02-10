import java.util.Scanner;

/**
 *  Create a program that can read some integers from
 *  keyboard and store them into an array.
 *
 *  First, read from keyboard how many elements you
 *  are going to store (the size of the array).
 *
 *  After the elements have been stored into the array,
 *  count the number of negative values in the array.
 */

public class countNegatives
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[5];
    int negative = 0;
    int i;

    for (i = 0; i < array.length; i++)
    {
      System.out.print("Enter 5 integers (both positive and negative): ");
      array[i] = scanner.nextInt();

      if (array[i] < 0)
      {
        negative++;
      }
    }

    System.out.println("The number of negatives are: " + negative);

    /**
    *  Same program just with positive numbers
    */

    /*int[] MyArray = new int[5];
    int HighNumber = 0;

    Scanner input = new Scanner(System.in);

    for(int i = 0; i<MyArray.length; i++) {
      System.out.println("Enter numbers");
      MyArray[i] = input.nextInt();

      if(MyArray[i]>0) {
        HighNumber++;
      }
    }
    System.out.println("The number of positive numbers are: " + HighNumber);*/

  }
}
