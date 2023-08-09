public class CreatingClassesAndObjectsExample {
  public class Person {
    public String name; // public field
    private int age; // private field

    // constructor
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public void sayHello() { // public method
      System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    private void doSomething() { // private method
    }
  }
}
