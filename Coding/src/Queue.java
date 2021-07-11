
public class Queue{

    private long[] queueArray;
    private int front,rear,size;
    private int capacity;
    public Queue(int data)
    {
        this.capacity=data;
        front=this.size=0;
        rear=this.capacity-1;
        queueArray=new long[this.capacity];
    }
    public void add(long data){
        try {
            if(size==capacity)
                throw new Exception("Queue is full");
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
        rear=(rear+1)%capacity;
        queueArray[rear]=data;
        size=size+1;   
    }
    public long poll(){
        try {
            if(size==0)
                throw new Exception("Queue is Empty");
        } catch (Exception e) {
            System.out.println(e);
            return Long.MIN_VALUE;
        }
        long item=queueArray[front];
        front=(front+1)%capacity;
        size--;
        return item;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==capacity;
    }
    public long front()
    {
        try {
            if(size==0)
                throw new Exception("Queue is Empty");
        } catch (Exception e) {
            System.out.println(e);
            return Integer.MIN_VALUE;
        }
        return queueArray[front];
    }
    public long rear(){
        try {
            if(size==0)
                throw new Exception("Queue is Empty");
        } catch (Exception e) {
            System.out.println(e);
            return Integer.MIN_VALUE;
        }
        return queueArray[rear];
    }
    public static void main(String[] args) {
        Queue queue = new Queue(1000);
 
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
 
        System.out.println(queue.poll()
                           + " dequeued from queue\n");
 
        System.out.println("Front item is "
                           + queue.front());
 
        System.out.println("Rear item is "
                           + queue.rear());
    }
}