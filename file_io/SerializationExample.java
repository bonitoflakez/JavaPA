import java.io.*;

class Student implements Serializable {
  String name;
  int age;

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class SerializationExample {
  public static void main(String[] args) {
    Student student = new Student("Alice", 20);

    // Serialization
    try (FileOutputStream fos = new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {
      oos.writeObject(student);
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Deserialization
    try (FileInputStream fis = new FileInputStream("student.ser");
        ObjectInputStream ois = new ObjectInputStream(fis)) {
      Student deserializedStudent = (Student) ois.readObject();
      System.out.println("Name: " + deserializedStudent.name);
      System.out.println("Age: " + deserializedStudent.age);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
