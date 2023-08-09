import java.io.*;

public class BufferedReaderAndBufferedWriter {
  public static void main(String[] args) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("buffered.txt"))) {
      writer.write("Hello, Buffered File I/O!");
    } catch (IOException e) {
      e.printStackTrace();
    }

    try (BufferedReader reader = new BufferedReader(new FileReader("buffered.txt"))) {
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
