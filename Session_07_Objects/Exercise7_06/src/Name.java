public class Name
{
  private String firstName;
  private String lastName;

  public Name(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }


  //when this method is called, it print out the full name.
  public Name(String fullname)
  {
    String[] splited = fullname.split("\\s+");
    this.firstName = splited[0];
    this.lastName = splited[1];
  }

  public String getFirstName()
  {
    return this.firstName;
  }

  public String getLastName()
  {
    return this.lastName;
  }

  //First and last name printed
  public String getFullName()
  {
    return this.firstName + " " + this.lastName;
  }

  //Last and then first name printed
  public String getFormalName()
  {
    return this.lastName + ", " + this.firstName;
  }

  public String toString()
  {
    return this.getFullName();
  }
}
