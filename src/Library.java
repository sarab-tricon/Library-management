import java.util.HashMap;
import java.util.Map;

public class Library {

  Map<String, LibraryItem> items;

  public Library() {
    items = new HashMap<>();
  }

  public void addItem(LibraryItem item) {
    items.put(item.id, item);
  }

  public LibraryItem findItem(String id) {
    return items.get(id);
  }

  public void displayAllItems() {
    for (LibraryItem item : items.values()) {
      item.displayInfo();
    }
  }
}
