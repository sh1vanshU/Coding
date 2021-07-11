package Multithreading;

import java.util.LinkedList;

public class Consumer extends Thread{

    Producer producer;
    Thread t2;
    public Consumer(Producer temp) throws InterruptedException {
        this.producer=temp;
        t2=new Thread(this);
        t2.start();
    }

    public void run(){
        try {
            for(int i=0;i<4;i++)
            {
                System.out.println(producer.buffer.charAt(i)+" ");
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("\n Buffer is EMPTY");
        // Producer produce;
        // try {
        //     produce = new Producer();
        // } catch (InterruptedException e) {
            
        //     e.printStackTrace();
        // }
        // Thread t3=new Thread(produce);
        // t3.start();
    }


    public void consume(LinkedList<Integer> list, int capacity) throws InterruptedException {
        while(true){
            synchronized(this){
                while(list.size()==0)
                    wait();
                
                int val=list.removeFirst();
                System.out.println("Consumer consumed - " + val);

                notify();

                // Thread.sleep(1000);
            }
        }
    }
    
}
