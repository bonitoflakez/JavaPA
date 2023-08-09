import java.io.*;

public class ReadingAndWritingTextFiles {
  public static void main(String[] args) {
    // write
    try (FileWriter writer = new FileWriter("ReadingAndWritingTextFiles.txt")) {
      writer.write("Hello, Java File I/O");
    } catch (IOException e) {
      e.printStackTrace();
    }

    // read
    try (FileReader reader = new FileReader("ReadingAndWritingTextFiles.txt")) {
      int character;
      while ((character = reader.read()) != -1) {
        System.out.print((char) character);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}