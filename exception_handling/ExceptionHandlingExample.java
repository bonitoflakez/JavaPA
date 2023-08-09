public class ExceptionHandlingExample {
  public static void main(String[] args) {
    try {
      int result = divide(10, 0);
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("Finally block executed.");
    }
  }

  static int divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("Division by zero");
    }
    return (a / b);
  }
}