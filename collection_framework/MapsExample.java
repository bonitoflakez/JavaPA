import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsExample {
  public static void main(String[] args) {
    Map<String, Integer> hashMap = new HashMap<>();
    hashMap.put("Apple", 1);
    hashMap.put("Banana", 2);
    hashMap.put("Cherry", 3);

    Map<String, Integer> treeMap = new TreeMap<>();
    treeMap.put("Dog", 4);
    treeMap.put("Elephant", 5);
    treeMap.put("Fox", 6);

    System.out.println("HashMap: " + hashMap);
    System.out.println("TreeMap: " + treeMap);
  }
}
