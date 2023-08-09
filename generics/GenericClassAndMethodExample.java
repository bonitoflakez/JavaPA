class Box<T> {
  private T content;

  Box(T content) {
    this.content = content;
  }

  T getContent() {
    return content;
  }
}

public class GenericClassAndMethodExample {
  public static <E> void printArray(E[] array) {
    for (E element : array) {
      System.out.print(element + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Box<Integer> integerBox = new Box<>(42);
    Box<String> stringBox = new Box<>("Hello, Generics!");

    System.out.println("Integer Box Content: " + integerBox.getContent());
    System.out.println("String Box Content: " + stringBox.getContent());

    Integer[] intArray = { 1, 2, 3, 4, 5 };
    String[] strArray = { "A", "B", "C", "D", "E" };

    System.out.print("Integer Array: ");
    printArray(intArray);

    System.out.print("String Array: ");
    printArray(strArray);
  }
}