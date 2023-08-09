class MyRunnable implements Runnable {
  public void run() {
    System.out.println("Thread is running.");
  }
}

public class ThreadExampleRunnable {
  public static void main(String[] args) {
    Thread thread = new Thread(new MyRunnable());
    thread.start();
  }
}
