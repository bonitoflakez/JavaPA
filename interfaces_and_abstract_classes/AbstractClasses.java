public class AbstractClasses {
  abstract class Animal {
    String name;

    Animal(String name) {
      this.name = name;
    }

    abstract void makeSound();
  }

  class Dog extends Animal {
    Dog(String name) {
      super(name);
    }

    void makeSound() {
      System.out.println(name + " says Woof!");
    }
  }

  public static void main(String[] args) {
    AbstractClasses abstractClasses = new AbstractClasses();
    AbstractClasses.Dog dog = abstractClasses.new Dog("Shiro");
    dog.makeSound();
  }
}
