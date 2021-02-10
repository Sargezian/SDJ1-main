import java.util.Scanner;

public class HelloMe
{
  public static void main(String[] args)
  {
    System.out.println("Hello Stefan!");

    String name;
    int age;
    double salary;

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter your name");
    name = input.nextLine();

    System.out.println("Please enter your age");
    age = input.nextInt();

    System.out.println("Please enter your hour-rate");
    salary = input.nextDouble();

    System.out.println("I now know that your name is " + name + " and you are " + age + " old " + "and earn " + salary + " each day");

  }
}
