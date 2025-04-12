//overrode movein and constructor

/* This is a stub for the House class */
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class House extends Building{

    private static final Exception RuntimeException = null;
    private ArrayList<Student> residents;
    private boolean hasDiningRoom;
    private boolean hasElevator;
  
    /**
     * Constructor for the House Class
     * @param name name of house
     * @param address address of house
     * @param nFloors number of floors in house
     * @param hasDiningRoom whether the house has a dining room
     */
    public House(String name, String address, int nFloors, Boolean hasDiningRoom, Boolean hasElevator){
      super(name, address, nFloors);
      this.hasDiningRoom = hasDiningRoom;
      this.hasElevator = hasElevator;
      residents = new ArrayList<Student>();
      System.out.println("You have built a house: 🏠");
    }
  
    public void goToFloor(int floorNum) {
      if (hasElevator){
        if (this.activeFloor == -1) {
          throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
        }
        if (floorNum < 1 || floorNum > this.nFloors) {
          throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
        }
        System.out.println("You are now on floor #" + floorNum + " of " + this.name);
        this.activeFloor = floorNum;
      }else{
        if ((this.activeFloor - floorNum) < 2 && (this.activeFloor - floorNum) > -2){
          this.activeFloor = floorNum;
        }else{
          System.out.println("You can't skip floors without an elevator. Travel one floor at a time.");
        }
      }
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
  
    //default version
    public void moveIn(){
      Student noName = new Student("No Name", "No ID", 0000);
      residents.add(noName);
    }
  
    /**
     * Removes a student from the house's list of residents
     * @param s student moving out of the house
     * @return student name
     * @throws Exception if student isn't in house to begin with
     */
    public Student moveOut(Student s){
      try{
        residents.remove(s);
      } catch (RuntimeException e){
        System.out.println("Student not in house");
      }
      //residents.remove(s);
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

  public void showOptions() {
    super.showOptions();
    System.out.println("moveIn()\n + moveOut()\n + isResident()");
  }

  public static void main(String[] args) {
    House Albright = new House("Albright","7 Bedford Terrace", 4, false, false);
    System.out.println(Albright);
    //Student abby = new Student("Abby","991473910",2028);
    //Albright.moveIn(abby);
    //System.out.println(Albright.moveOut(abby));
    Student jill = new Student("Jill","991473910",2028);
    System.out.println(Albright.moveOut(jill));
    
    //Albright.showOptions();



  }

}