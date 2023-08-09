import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsExample {
  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<>();
    arrayList.add("Apple");
    arrayList.add("Banana");
    arrayList.add("Cherry");

    List<String> linkedList = new LinkedList<>();
    linkedList.add("Dog");
    linkedList.add("Elephant");
    linkedList.add("Fox");

    System.out.println("ArrayList: " + arrayList);
    System.out.println("LinkedList: " + linkedList);
  }
}