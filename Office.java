
/**
* Office.java - a class to generate an object Office
* @author Joey Saponaro
* @see Room
*/

public class Office extends Room
{
  private String owner;

  //constructor

  /**
  * Constructor to set variables for object Office
  * @param number The String room number of the office
  * @param capacity The int capacity of the office
  * @param area The int area of the office
  * @param owner The String name of the owner of the office
  */
  public Office(String number, int capacity, int area, String owner)
  {
    super(number, capacity, area);
    this.owner = owner;
  }


  //getters

  /**
  * Gets the name of the owner of the office
  * @return String name of owner
  */
  public String getOwner() { return owner; }

  //setters

  /**
  * Sets the name of the owner of the office
  * @param String o The name of the person who owns the office
  */
  public void setOwner(String o) { this.owner = o; }

  //toString

  /**
  * toString method for object Lab
  * @return String output of object Lab
  */
  public String toString()
  {
    String str = String.format("\nOwner: " + owner);
    return super.toString() + str;
  }






}
