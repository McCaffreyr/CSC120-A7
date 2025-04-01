/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;

    /**
     * Constructor for Library Class
     * @param name name of library
     * @param address address of library
     * @param nFloors number of floors in library
     */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      System.out.println("You have built a library: 📖");
      this.collection = new Hashtable<>();
    }

    /**
     * Adds a title to the library's collection
     * @param title book title
     */
    public void addTitle(String title){
      collection.put(title, true);
    }
    
    /**
     * Removes a title from the library's collection
     * @param title book title
     * @return book title
     */
    public String removeTitle(String title){
      collection.remove(title);
      return title;
    }

    /**
     * Checks out a library book
     * @param title book title
     */
    public void checkOut(String title){
      if (collection.containsKey(title)){
        if (collection.get(title) == true){
          collection.put(title,false);
        } else{
          System.out.println("Title unavailable");
        }
      } else {
        System.out.println("Title is not in the library's collection");
      }
    }
    
    /**
     * Returns library book/adds it back to the available books
     * @param title book title
     */
    public void returnBook(String title){
      collection.put(title,true);
    }

    /**
     * Shows whether the library has the book whether or not available
     * @param title book title
     * @return T/F whether the library contains the book
     */
    public boolean containsTitle(String title){
      return collection.contains(title);
    }
    
    /**
     * Shows whether a book is available to be checked out
     * @param title book title
     * @return T/F whether the book is in stock
     */
    public boolean isAvailable(String title){
      return collection.get(title);
    }
    
    /**
     * Shows the collection of all library books
     */
    public void printCollection(){
      for (String key : collection.keySet()) {
        Boolean value = collection.get(key);
        System.out.println("Book: " + key + ", In stock: " + value);
      }
    }
  
    public static void main(String[] args) {
      Library Neilson = new Library("Neilson","7 Bedford Terrace",4);
      Neilson.addTitle("The Lorax by Dr. Seuss");
      Neilson.addTitle("Madame Bovery by Gustave Flaubert");
      Neilson.addTitle("The Heart is a Lonely Hunter by Carson McCullers");
      Neilson.printCollection();
      System.out.println(Neilson.isAvailable("The Lorax by Dr. Seuss"));
      Neilson.checkOut("The Lorax by Dr. Seuss");
      Neilson.checkOut("The Lorax by Dr. Seuss");




    }
  
  }