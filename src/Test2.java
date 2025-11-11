public class Test2 {

  static int calculate(int a) {
    return a * a;
  }

  static double calculate(double a, double b) {
    return a * b;
  }

  public static void main(String[] args) {
    System.out.println(" square :" + calculate(2));
    System.out.println(" square :" + calculate(2.5, 2.5));
  }
}
