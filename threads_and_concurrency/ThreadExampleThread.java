class MyThread extends Thread {
  public void run() {
    System.out.println("Thread is running.");
  }
}

public class ThreadExampleThread {
  public static void main(String[] args) {
    MyThread thread = new MyThread();
    thread.start();
  }
}