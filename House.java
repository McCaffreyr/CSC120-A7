/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building{

  private ArrayList<Student> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, Boolean hasDiningRoom){
    super(name, address, nFloors);
    hasDiningRoom = true;
    new ArrayList<Student>();
    System.out.println("You have built a house: 🏠");
  }

  public boolean hasDiningRoom() {
    return hasDiningRoom;
  }

  public int nResidents(){
    return residents.size();
  }

  public void moveIn(Student s){
    residents.add(s);
  }

  public Student moveOut(Student s){
    residents.remove(s);
    return s;
  }

  public boolean isResident(Student s){
    return residents.contains(s);
  }

  public static void main(String[] args) {
    new House("Albright","7 Bedford Terrace",4,true);
  }

}