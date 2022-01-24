import java.util.Scanner;

public class Lektion5_07
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[4];
        int [] array2 = new int[4];
        boolean ens = true;

        System.out.println("Skriv 4 tal");

        for (int i = 0; i < array1.length; i++)
        {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Undskyld vi skal lige bruge 4 mere:");

        for (int i = 0; i < array2.length; i++)
        {
            array2[i] = scanner.nextInt();
        }


        for (int i = 0; i < array2.length; i++)
        {
            if (array1 [i] != array2[i])
            {
                ens = false;
                break;
            }
        }
        System.out.println( " Dine arrays er " + (ens));
    }
}
