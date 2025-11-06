
import java.util.jar.Attributes;
import java.util.ArrayList;
//public House extends Building and implements HouseRequirements
public class House extends Building implements HouseRequirements{
  protected ArrayList<Student> residents;
  protected boolean hasDiningRoom;
  // constructor
public House(String name, String Address, int nFloors, boolean hasDiningRoom){
  super(name, Address, nFloors);
  this.residents=new ArrayList<Student>();
  this.hasDiningRoom=hasDiningRoom;
  System.out.println("You have built a house: 🏠");
}
public boolean hasDiningRoom()
{
  return this.hasDiningRoom;
}
public int nResidents(){
return this.residents.size();
}
// Adding and remo
public void moveIn(Student s){
  this.residents.add(s);
};
public boolean isResident(Student s) {
  if (residents.isEmpty()) {
    throw new RuntimeException("House is empty");
  }

  if (this.residents.contains(s)) {
    return true;
  } else {
    throw new RuntimeException(s + " is not in this house");
  }
}
public Student moveOut(Student s){
  if (isResident(s)){
    this.residents.remove(s);
    return s;
  }
   else {
    throw new RuntimeException(s + " is not in this house");
  }
}



/* This is a stub for the House class */
  public static void main(String[] args) {
    House myHouse= new House("Cutter","10 Prospect Street",3,true);
  }

}