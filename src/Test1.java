class Grandparent {

  void m1() {
    System.out.println("GrandPArent class");
  }
}

class Parent extends Grandparent {

  void m2() {
    System.out.println("PArent class");
  }
}

class Child extends Parent {

  void m3() {
    System.out.println("Child1 class");
  }
}

class Child2 extends Parent {

  void m3() {
    System.out.println("Child2 class");
  }
}


public class Test1 {

  public static void main(String[] args) {
    Child c = new Child();
    c.m3();
    Child2 c2 = new Child2();
    c2.m3();
  }
}
