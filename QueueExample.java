import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        //Adding elements to the queue
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        //Displaying the queue
        System.out.println("Queue: " + queue);

        //Removing an element
        String removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);

        //Displaying the updated Queue
        System.out.println("Updated Queue: " + queue);

        //Peeking at the front element
        String frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        //Displaying the final Queue
        System.out.println("Final Queue: " + queue);
    }
}
