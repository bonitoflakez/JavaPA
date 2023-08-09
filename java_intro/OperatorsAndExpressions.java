public class OperatorsAndExpressions {
  public static void main(String[] args) {
    // arithmetic operators
    int a = 10, b = 20;
    int sum= a + b;
    int difference = a - b;
    int product = a * b;
    double division = (double) a / b;
    int remainder = a % b;

    // relational operators
    boolean isEqual = a == b;
    boolean isNotEqual = a != b;
    boolean isGreater = a > b;
    boolean isLessOrEqual = a <= b;
    boolean isGreaterOrEqual = a >= b;

    // logical operators
    boolean condition1 = true, condition2 = false;
    boolean andResult = condition1 && condition2;
    boolean orResult = condition1 || condition2;
    boolean notResult = !condition1;

    // increment and decrement operators
    int count = 5;
    count++;
    count--;

    // string concatenation
    String firstName = "John";
    String lastName = "Doe";
    String fullName = firstName + " " + lastName;
  }
}
