public class Interfaces {
  interface Shape {
    double calculateArea();

    double calculatePerimeter();
  }

  class Circle implements Shape {
    double radius;

    Circle(double radius) {
      this.radius = radius;
    }

    public double calculateArea() {
      return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
      return 2 * Math.PI * radius;
    }
  }

  public static void main(String[] args) {
    Interfaces interfaces = new Interfaces();
    Interfaces.Circle myCircle = interfaces.new Circle(5);
    double area = myCircle.calculateArea();
    double perimeter = myCircle.calculatePerimeter();

    System.out.println("Circle Area: " + area);
    System.out.println("Circle Perimeter: " + perimeter);
  }
}
