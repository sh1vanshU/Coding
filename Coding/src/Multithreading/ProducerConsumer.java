package Multithreading;

import java.util.LinkedList;

public class ProducerConsumer {
    public static void main(String[] args) throws InterruptedException{

        // LinkedList<Integer> list=new LinkedList<>();
        // int capacity=5;
        // PC pc=new PC();
        // Thread t1=new Thread(new Runnable(){
        //     @Override
        //     public void run(){
        //         try {
        //             // call producer here and pass producer data reference.
        //             pc.produce(list,capacity);
        //         } catch (InterruptedException e) {
        //             //TODO: handle exception
        //             e.printStackTrace();
        //         }
        //     }
        // });
        
        // Thread t2=new Thread(new Runnable(){
        //     @Override
        //     public void run(){
        //         try {
        //             // call consumer here and pass resource to consume.
        //             pc.consume(list,capacity);
        //         } catch (InterruptedException e) {
        //             //TODO: handle exception
        //             e.printStackTrace();
        //         }
        //     }
        // });

        // t1.start();
        // t2.start();
        // t1.join();
        // t2.join();

        Producer producer=new Producer();
        // Thread t1=new Thread(producer);
        // t1.start();
    }
    public static class PC{
        
        public void produce(LinkedList<Integer> list,int capacity) throws InterruptedException {
            int value=0;
            while(true){
                synchronized(this){
                    while(list.size()==capacity)
                        wait();
    
                    System.out.println("Producer produced - "+ value);
    
                    list.add(value++);
    
                    notify();
    
                    Thread.sleep(100);
                }
            }
        }
    

        public void consume(LinkedList<Integer> list,int capacity) throws InterruptedException {
            while(true){
                synchronized(this){
                    while(list.size()==0)
                        wait();
                    
                    int val=list.removeFirst();
                    System.out.println("Consumer consumed - " + val);

                    notify();

                    Thread.sleep(100);
                }
            }
        }
    }
}
