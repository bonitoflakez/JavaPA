abstract class Shape {
  abstract double area();
}

class Circle extends Shape {
  double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  double area() {
    return (Math.PI * radius * radius);
  }
}

class Rectangle extends Shape {
  double length, width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  double area() {
    return (length * width);
  }
}

public class AbstractClassesAndMethodsExample {
  public static void main(String[] args) {
    Shape myShape;

    myShape = new Circle(5.0);
    System.out.println("Area of circle: " + myShape.area());

    myShape = new Rectangle(4.0, 3.0);
    System.out.println("Area of rectangle: " + myShape.area());
  }
}
