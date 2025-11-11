class Animal {

  void sound() {
    System.out.println("Animal sound");
  }
}

class Dog extends Animal {

  void sound() {
    System.out.println("Dog barking");
  }
}


public class Test3 {

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.sound();
      
  }
}
