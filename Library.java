/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building implements LibraryRequirements{
  private Hashtable<String, Boolean> collection;

    public Library(String name, String Address, int nFloors) {
      super(name, Address, nFloors);
      this.collection= new Hashtable<String,Boolean>();
      System.out.println("You have built a library: 📖");
    }
  public void addTitle(String title){
    this.collection.put(title, true);

  }
  public String removeTitle(String title){
    this.collection.remove(title);
    return title;

  }
  public void checkOut(String title){
    this.collection.put(title, false);

  }
  public void returnBook(String title){
    this.collection.put(title, true);

  }
  
    public static void main(String[] args) {
      new Library();
    }
  
  }