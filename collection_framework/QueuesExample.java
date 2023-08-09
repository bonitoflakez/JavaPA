import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesExample {
  public static void main(String[] args) {
    Queue<String> priorityQueue = new PriorityQueue<>();
    priorityQueue.offer("Apple");
    priorityQueue.offer("Banana");
    priorityQueue.offer("Cherry");

    Queue<String> linkedListQueue = new LinkedList<>();
    linkedListQueue.offer("Dog");
    linkedListQueue.offer("Elephant");
    linkedListQueue.offer("Fox");

    System.out.println("PriorityQueue: " + priorityQueue);
    System.out.println("LinkedList Queue: " + linkedListQueue);
  }
}
