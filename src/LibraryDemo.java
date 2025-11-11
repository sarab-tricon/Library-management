public class LibraryDemo {

  public static void main(String[] args) {
    Library library = new Library();

    // Create books
    Book b1 = new Book("B101", "War and Peace", true, "Leo Tolstoy");
    Book b2 = new Book("B102", "Ulysses", true, "James Joyce");
    Book b3 = new Book("Utopia", "C++ Fundamentals", true, "Sir Thomas Moor");

    library.addItem(b1);
    library.addItem(b2);
    library.addItem(b3);

    library.displayAllItems();

    //borrow
    b1.borrowItem("user001");
    b1.borrowItem("user002");

    //return
    b1.returnItem("user002");
    b1.returnItem("user001");

    library.displayAllItems();

  }
}