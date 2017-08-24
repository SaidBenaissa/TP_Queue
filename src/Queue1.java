/**
 * Created by benaissa on 8/24/17.
 */
public class Queue1 {
    int front, rear, size;
    int capacity;
    int array[];

    public Queue1(int capacity) {
        this.capacity = capacity;
        this.size = front =0;
        rear = capacity - 1;
        array =new int[this.capacity];

    }

    // Queue is empty when size equal to capacity
    boolean isFull(Queue1 queue1)
    {
        return (queue1.size==queue1.capacity);
    }

    // Queue is empty when size is 0
    boolean isEmpty(Queue1 queue1)
    {
        return (queue1.size==0);
    }


    // Method to add an item to the queue.
    // It changes rear and size
    void enqueue(int item)
    {
        if(isFull(this))
        {
            return;
        }else {
            this.rear=(this.rear + 1) % this.capacity;
            this.array [this.rear] = item;
            this.size = this.size + 1;
            System.out.println(item+ " is equeued to queue1.");
        }

    }

    // Method to remove an item from queue.
    // It changes front and size
    int dequeue()
    {
        if (isEmpty(this)){
            return Integer.MAX_VALUE;
        }else {
            int item = this.array[this.front];
            this.front = (this.front +1) % this.capacity;
            this.size = this.size -1;
            return item;
        }

    }

    // Method to get front of queue


    public int getFront() {
        if (isEmpty(this)) {
            return Integer.MIN_VALUE;
        } else {
            return this.array[this.front];
        }
    }

    public int getRear() {
        if (isEmpty(this)) {
            return Integer.MIN_VALUE;
        } else {
            return this.array[this.rear];
        }
    }
}

