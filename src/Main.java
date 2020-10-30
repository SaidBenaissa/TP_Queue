/**
 * Created by benaissa on 8/24/17.
 */
// Driver class ----- TEST
public class Main
{
    public static void main(String[] args)
    {
//        Queue queue = new Queue(1000);
//
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.enqueue(40);
//      //  queue.dequeue();
//
//        System.out.println(queue.dequeue() + " dequeued from queue\n");
//
//        System.out.println("Front item is " + queue.front());
//
//        System.out.println("Rear item is " + queue.rear());

        //////////////////////////////////////////
        Queue1 queue1 = new Queue1(10);

        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        queue1.enqueue(40);
        queue1.dequeue();

        System.out.println(queue1.dequeue() + " dequeued from queue1\n");

        System.out.println("Front item is " + queue1.getFront());

        System.out.println("Rear item is " + queue1.getRear());
    }
}
