import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentExample {
  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(3);

    for (int i = 0; i < 10; i++) {
      executor.submit(() -> {
        System.out.println("Thread is running");
      });
    }

    executor.shutdown();
  }
}
