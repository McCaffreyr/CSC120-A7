/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building{

  private ArrayList<Student> residents;
  private boolean hasDiningRoom;

  /**
   * Constructor for the House Class
   * @param name name of house
   * @param address address of house
   * @param nFloors number of floors in house
   * @param hasDiningRoom whether the house has a dining room
   */
  public House(String name, String address, int nFloors, Boolean hasDiningRoom){
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    residents = new ArrayList<Student>();
    System.out.println("You have built a house: 🏠");
  }

  /**
   * Shows whether the house has a dining room
   * @return T/F depending on if the house has a dining room
   */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /**
   * Shows number of residents in house
   * @return number of residents
   */
  public int nResidents(){
    if (residents == null){
      return 0;
    } else{
      return residents.size();
    }
  }

  /**
   * Adds a student to the house's list of residents
   * @param s student moving into the house
   */
  public void moveIn(Student s){
    residents.add(s);
  }

  /**
   * Removes a student from the house's list of residents
   * @param s student moving out of the house
   * @return student name
   */
  public Student moveOut(Student s){
    residents.remove(s);
    return s;
  }

  /**
   * Says whether a student is a resident of a house
   * @param s student in question
   * @return T/F if they are a hosue resident
   */
  public boolean isResident(Student s){
    return residents.contains(s);
  }

  public static void main(String[] args) {
    House Albright = new House("Albright","7 Bedford Terrace",4,false);
    System.out.println(Albright);
    System.out.println(Albright.hasDiningRoom());
    Student abby = new Student("Abby","991473910",2028);
    Albright.moveIn(abby);
    System.out.println(Albright.isResident(abby));
    System.out.println(Albright.nResidents());

    System.out.println(Albright.moveOut(abby));
    System.out.println(Albright.isResident(abby));
    System.out.println(Albright.nResidents());



  }

}