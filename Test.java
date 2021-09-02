import java.util.Scanner;


public class Test
{
  public static void main(String[] args) {

    Room [] rooms = new Room[5];

    rooms[0] = new Lab("PA-110", 65, 150, 45);

    rooms[1] = new Office("PA-252", 2, 36, "Houria Oudghiri");

    rooms[2] = new Lab("PA-202", 45, 100, 25);

    rooms[3] = new Classroom("PA101", 20, 45);

    rooms[4] = new Lab("PA100", 47, 120, 40);


    boolean exitProgram = false;

    while (exitProgram == false)
    {
      try
      {
        System.out.println("Select an operation:");
        System.out.println(String.format("[1] Find a room \n[2] View all rooms \n[3] Sort rooms \n[4] Exit"));
        Scanner firstNum = new Scanner(System.in);
        int inputNum = firstNum.nextInt();


        if (inputNum == 1)
        {
          System.out.print("Enter the room number: ");
          Scanner index = new Scanner(System.in);
          String roomNumber = index.nextLine();
          int roomCheck = findRoom(rooms, roomNumber);
          if ( roomCheck != -1 )
            { System.out.println(rooms[roomCheck].toString()); }
          else
            {System.out.println("Room not found.");}
        }

        if (inputNum == 2)
        { printRooms(rooms); }

        if (inputNum == 3)
        { sortRooms(rooms); }


        if (inputNum == 4)
        {
          exitProgram = true;
          System.out.println("Have a great day!");
        }
      }
      catch(Exception e)
        {System.out.println("That is not a valid input.");}

      }


  }

  /**
  * Method used to print an array of object Room
  * @param list A list of objects Room
  */
  public static void printRooms(Room[] list)
  {
      for( int i = 0; i < list.length; i++)
        {
          System.out.println(list[i].toString());
          System.out.println(" ");
        }
  }

  /**
  * Method to find a room by searching for its room number
  * @param list a list of objects Room
  * @param roomNumber String room number
  * @return int -1 if room is not found, int room index in list if room is found
  */

  public static int findRoom(Room[] list, String roomNumber)
  {
    for( int i = 0; i < list.length; i++)
    {
      if (list[i].getNumber().equals(roomNumber))
      { return i; }

    }
    return -1;
  }

  /**
  * Method applying the insertion sort algorithm to sort a list of object Room
  * @param list a list of objects Room
  */
  public static void sortRooms(Room[] list) {
    for ( int i = 1; i < list.length; i++)
    {
      //insert element i in the sorted sub-list
      Room currentVal = list[i];
      int j = i;
      while ( j > 0 && currentVal.getCapacity() < list[j-1].getCapacity())
      {
        //shift element (j-1) into element (j)
        list[j] = list[j-1];
        j--;
      }
      //Insert currentVal at position j
      list[j] = currentVal;
    }
    printRooms(list);
  }
}
