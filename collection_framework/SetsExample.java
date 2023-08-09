import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsExample {
  public static void main(String[] args) {
    Set<String> hashSet = new HashSet<>();
    hashSet.add("Apple");
    hashSet.add("Banana");
    hashSet.add("Cherry");

    Set<String> treeSet = new TreeSet<>();
    treeSet.add("Dog");
    treeSet.add("Elephant");
    treeSet.add("Fox");

    System.out.println("HashSet: " + hashSet);
    System.out.println("TreeSet: " + treeSet);
  }
}
