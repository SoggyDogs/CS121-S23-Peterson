public class LinkedListQueueTester {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        //1.
        System.out.println("1.");
        queue.enqueue("Tom");
        queue.enqueue("Jane");
        queue.enqueue("Beth");
        System.out.println(queue.displayQueue());

        //2.
        System.out.println("2.");
        queue.enqueue("John");
        queue.enqueue("Mary");
        System.out.println(queue.displayQueue());

        //3.
        System.out.println("3.");
        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Number of items in queue is " + queue.size());
        System.out.println("The head of the queue is: " + queue.peek());
        System.out.println("Remove " + queue.dequeue());

        //4.
        System.out.println("\n4.");
        System.out.println(queue.displayQueue());

        //5.
        System.out.println("5.");
        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Number of items in queue is " + queue.size());
        System.out.println("The head of the queue is: " + queue.peek());

        //6.
        System.out.println("\n6.");
        System.out.println("Remove" + queue.dequeue());
        System.out.println("The head of the queue is: " + queue.peek());

        //7.
        System.out.println("\n7.");
        System.out.println("Remove " + queue.dequeue());
        System.out.println("The head of the queue is: " + queue.peek());

        //8.
        System.out.println("\n8.");
        System.out.println("Remove " + queue.dequeue());
        System.out.println("The head of the queue is: " + queue.peek());

        //9.
        System.out.println("\n9.");
        System.out.println("Remove " + queue.dequeue());
        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("The head of the queue is: " + queue.peek());

        //10.
        System.out.println("\n10.");
        System.out.println("Queue is empty: " + queue.isEmpty());
    }
}
