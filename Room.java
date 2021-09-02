
/**
* Room.java - a class to generate an object Room
* @author Joey Saponaro
*/

public class Room
{

  private String number;
  private int capacity;
  private int area;

  //constructors

  /**
  * Constructor to set variables for object Room
  * @param number The String room number of the room
  * @param capacity The int capacity of the room
  * @param area The int area of the room
  */
  public Room(String number, int capacity, int area)
  {
    this.number = number;
    this.capacity = capacity;
    this.area = area;
  }

  //getters

  /**
  * Gets the room number
  * @return String room number
  */
  public String getNumber() { return number; }

  /**
  * Gets capacity of the room
  * @return int capacity of room
  */
  public int getCapacity() { return capacity; }

  /**
  * Gets the area of the room
  * @return int area of room
  */
  public int getArea() { return area; }

  //setters

  /**
  * Sets the room number
  * @param String n the room number
  */
  public void setNumber(String n) { this.number = number; }

  /**
  * Sets the capacity of the room
  * @param int c capacity of room
  */
  public void setCapacity(int c) { this.capacity = capacity; }

  /**
  * Sets the area of the room
  * @param int a area of room
  */
  public void setArea(int a) { this.area = area; }

  //toString

  /**
  * toString method for object Room
  * @return String output of object Room
  */
  public String toString()
  {
    return String.format("Number: %s\nCapacity: %s\nArea: " +  area, number, capacity);
  }
}
