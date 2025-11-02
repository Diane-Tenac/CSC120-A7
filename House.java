
import java.util.jar.Attributes;
import java.util.ArrayList;
//public class House implements HouseRequirements{
public class House extends Building{
  protected ArrayList<Student> residents;
  protected boolean hasDiningRoom;
  // constructor
public House(String Name, String Address, int nFloors,ArrayList<Student> residents, boolean hasDiningRoom){
  super(Name, Address, nFloors);
  this.residents=residents;
  this.hasDiningRoom=hasDiningRoom;
}
public boolean gethasDiningRoom()
{
  return this.hasDiningRoom();
}
  
];
public int nResidents();
public void moveIn(Student s);
public Student moveOut(Student s);


}




/* This is a stub for the House class */

  House extend building;
  

  public House(ArrayList<Student> residents,boolean hasDiningRoom) {
    super( Name, Address, nFloors);

    System.out.println("You have built a house: 🏠");
  }

  public static void main(String[] args) {
    new House();
  }

}
}