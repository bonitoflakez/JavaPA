import java.util.ArrayList;
import java.util.List;

public class WildcardsExample {
  public static void printList(List<?> list) {
    for (Object element : list) {
      System.out.print(element + " ");
    }
    System.out.println();
  }

  public static double sumOfList(List<? extends Number> list) {
    double sum = 0.0;
    for (Number number : list) {
      sum += number.doubleValue();
    }
    return sum;
  }

  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>();
    List<Double> doubles = new ArrayList<>();

    integers.add(1);
    integers.add(2);

    doubles.add(3.14);
    doubles.add(2.71);

    printList(integers);
    printList(doubles);

    System.out.println("Sum of Integers: " + sumOfList(integers));
    System.out.println("Sum of Doubles: " + sumOfList(doubles));
  }
}
