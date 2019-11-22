package main.java.educative.com.practice.stacksandququeues;

public class QueueMain {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>(5);
        queue.enqueue(2);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(10);
        queue.dequque();
        queue.dequque();
        queue.enqueue(12);
        queue.enqueue(14);

        System.out.println("Queue:");
        while (! queue.isEmpty()){
            System.out.print(queue.dequque()+ "  ");
        }
    }
}
