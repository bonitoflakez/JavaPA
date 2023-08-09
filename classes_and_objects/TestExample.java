class Car {
  String brand;
  String model;
  int year;
}

class Rectangle {
  double length;
  double width;

  double calculateArea() {
    return length * width;
  }
}

class Student {
  String name;
  int age;
  int rollNumber;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
    this.rollNumber = generateRollNumber();
  }

  private static int lastRollNumber = 1000;

  private int generateRollNumber() {
    lastRollNumber++;
    return lastRollNumber;
  }
}

class BankAccount {
  public double balance;
  // should be private

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
    } else {
      System.out.println("Insufficient balance.");
    }
  }
}

class SavingsAccount extends BankAccount {
  public double calculateInterest() {
    double interestRate = 0.05;
    return balance * interestRate;
  }
}

class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

class Product {
  String name;
  double price;
  double discountedPrice;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
    this.discountedPrice = price * 0.9; // 10% discount
  }

  public Product(String name, double price, double discountPercentage) {
    this(name, price);
    this.discountedPrice = price * (1 - discountPercentage / 100);
  }
}

public class TestExample {
  public static void main(String[] args) {
    Car myCar = new Car();

    myCar.brand = "Porsche";
    myCar.model = "911 GT3 RS";
    myCar.year = 2022;

    System.out.println("Brand: " + myCar.brand);
    System.out.println("Model: " + myCar.model);
    System.out.println("Year: " + myCar.year);

    Rectangle myRectangle = new Rectangle();

    myRectangle.length = 5.0;
    myRectangle.width = 3.0;

    double area = myRectangle.calculateArea();
    System.out.println("Area: " + area);

    Student student1 = new Student("Alice", 20);
    Student student2 = new Student("Bob", 21);

    System.out
        .println("Student 1: " + student1.name + ", Age: " + student1.age + ", Roll Number: " + student1.rollNumber);
    System.out
        .println("Student 2: " + student2.name + ", Age: " + student2.age + ", Roll Number: " + student2.rollNumber);

    SavingsAccount mySavingsAccount = new SavingsAccount();

    mySavingsAccount.deposit(1000);
    mySavingsAccount.withdraw(200);

    System.out.println("Interest: " + mySavingsAccount.calculateInterest());

    Person person = new Person();

    person.setName("Alice");
    person.setAge(30);

    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.getAge());

    Product product1 = new Product("Laptop", 900.0);
    Product product2 = new Product("Phone", 500.0, 20.0);

    System.out.printf("Product 1: %s, Price: $%.2f, Discounted Price: $%.2f%n",
        product1.name, product1.price, product1.discountedPrice);

    System.out.printf("Product 2: %s, Price: $%.2f, Discounted Price: $%.2f%n",
        product2.name, product2.price, product2.discountedPrice);
  }
}
