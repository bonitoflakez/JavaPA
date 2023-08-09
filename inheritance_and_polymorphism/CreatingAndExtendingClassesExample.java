class Animal {
  void makeSound() {
    System.out.println("Some generic sound");
  }
}

class Dog extends Animal {
  void makeSound() {
    System.out.println("Woof!");
  }

  void fetch() {
    System.out.println("Fetching a ball");
  }
}

public class CreatingAndExtendingClassesExample {
  public static void main(String[] args) {
    Animal myAnimal = new Dog();
    myAnimal.makeSound();
  }
}