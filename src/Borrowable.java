public interface Borrowable {

  void borrowItem(String userId);

  void returnItem(String userId);
}
