public class Book extends LibraryItem implements Borrowable {

  String author;
  String borrowedBy;

  public Book(String id, String title, boolean isAvailable, String author) {
    super(id, title, isAvailable);
    this.author = author;
  }

  @Override
  public void borrowItem(String userId) {
    if (!isAvailable) {
      throw new BookNotAvailableException();
    }

    isAvailable = false;
    borrowedBy = userId;
    System.out.println(title + " is borrowed by : " + userId);
  }


  @Override
  public void returnItem(String userId) {
    if (isAvailable || !borrowedBy.equals(userId)) {
      throw new InvalidReturnException();
    }
    isAvailable = true;
    borrowedBy = null;
    System.out.println(title + " has been returned by user: " + userId);
  }

  @Override
  public void displayInfo() {
    System.out.println("Book ID: " + id);
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    System.out.println("---------------------------------");
  }
}
