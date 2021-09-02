
/**
* Lab.java - a class to generate an object Lab
* @author Joey Saponaro
* @see Room
*/

  public class Lab extends Room
  {

    private int computers;


    //constructor

    /**
    * Constructor to set variables for object Lab
    * @param number The String room number of the lab
    * @param capacity The int capacity of the lab
    * @param area The int area of the lab
    * @param computers The int amount of computers in the lab
    */
    public Lab(String number, int capacity, int area, int computers)
    {
      super(number, capacity, area);
      this.computers = computers;
    }

    //getters

    /**
    * Gets the amount of computers in the lab
    * @return int amount of computers
    */
    public int getComputers() { return computers; }

    //setters

    /**
    * Sets the amount of computers in a lab
    * @param int c The amount of computers that will be in the lab
    */
    public void setComputers(int c) { this.computers = c; }

    //toString
    
    /**
    * toString method for object Lab
    * @return String output of object Lab
    */
    public String toString()
    {
      String str = String.format("\nComputers: " + computers);
      return super.toString() + str;
    }
}
