abstract public class LibraryItem {

  String id;
  String title;
  boolean isAvailable;

  public LibraryItem(String id, String title, boolean isAvailable) {
    this.id = id;
    this.title = title;
    this.isAvailable = isAvailable;
  }

  public abstract void displayInfo();

}
