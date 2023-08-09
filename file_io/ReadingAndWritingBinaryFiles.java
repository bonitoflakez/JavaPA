import java.io.*;

public class ReadingAndWritingBinaryFiles {
  public static void main(String[] args) {
    // write
    try (FileOutputStream fos = new FileOutputStream("data.bin"); DataOutputStream dos = new DataOutputStream(fos)) {
      dos.writeInt(42);
      dos.writeDouble(3.14);
    } catch (IOException e) {
      e.printStackTrace();
    }

    // read
    try (FileInputStream fis = new FileInputStream("data.bin"); DataInputStream dis = new DataInputStream(fis)) {
      int intValue = dis.readInt();
      double doubleValue = dis.readDouble();
      System.out.println("int value: " + intValue);
      System.out.println("double value: " + doubleValue);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
