public class TestRectangle
{
  public static void main(String[] args)
  {
    // Length and width
    double length = 10.5;
    double width = 5;

    // Create Rectangle.
    Rectangle rectangle = new Rectangle(length, width);

    System.out.println("Length is: " + rectangle.getLength());
    System.out.println("Width is: " + rectangle.getWidth());
    System.out.println("Area is: " + rectangle.getArea());

    // creating here some new values for my object
    length = 10;
    width = 10;

    //Set is used here to modify our first created object(Rectangle).
    rectangle.setLength(length);
    rectangle.setWidth(width);

    /*//This works to
    rectangle.setLength(10);
    rectangle.setWidth(10);*/

    //We are now printing the new values for our new modified object(Rectangle).
    System.out.println("Length is: " + rectangle.getLength());
    System.out.println("Width is: " + rectangle.getWidth());
    System.out.println("Area is: " + rectangle.getArea());

  }
}
