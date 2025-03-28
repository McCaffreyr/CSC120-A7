/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;

    public Library() {
      System.out.println("You have built a library: 📖");
      Hashtable<String, boolean>
      //img src="https://cdn-icons-png.flaticon.com/512/1596/1596485.png";
      //alt="Library icon created by Freepik - Flaticon";
      //width="200";
    }

    public void addTitle(String title){
      collection.put(title);
    }
    
    public String removeTitle(String title){
      collection.remove(title);
      return title;
    }

    public void checkOut(String title){

    }
    
    public void returnBook(String title){

    }

    public boolean containsTitle(String title){
      return collection.contains(title);
    }
    
    public boolean isAvailable(String title){

    }
    
    public void printCollection(){
      System.out.println(collection);
      //make in easy to read format
    }
  
    public static void main(String[] args) {
      new Library();
    }
  
  }