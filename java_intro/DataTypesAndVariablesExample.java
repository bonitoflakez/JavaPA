import java.util.ArrayList;

public class DataTypesAndVariablesExample {
  public static void main(String[] args) {
    // primitive data types
    int age = 10;
    double weight = 50;
    char grade = 'A';
    boolean isMarried = false;

    // reference data types
    String message = "Hewwo?";
    int[] numbers = {1, 2, 3, 4, 5};
    ArrayList<String> names = new ArrayList<>();
    names.add("Alice");
    names.add("Bob");

    // type casting
    int x = 10;
    double y = (double) x;

    // constants
    final double PI = 3.14159;
    final String APP_NAME = "Some APP";
  }
}
