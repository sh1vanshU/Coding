package Multithreading;

import java.util.LinkedList;

public class Producer extends Thread {

    StringBuffer buffer;
    Thread t1;
    public Producer() throws InterruptedException{
        buffer=new StringBuffer(4);
        t1=new Thread(this);
        t1.start();
    }

    
    public void run(){
        for(int i=0;i<4;i++){
            try {
                buffer.append(i);
                System.out.println("Buffer append "+i);
            } catch (Exception e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
        System.out.println("Buffer is FULL");
        try {
            Consumer consumer=new Consumer(this);
            t1=new Thread(consumer);
            t1.start();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void produce(LinkedList<Integer> list, int capacity) throws InterruptedException {
        int value=0;
        while(true){
            synchronized(this){
                while(list.size()==capacity)
                    wait();

                System.out.println("Producer produced - "+ value);

                list.add(value++);

                notify();

                // Thread.sleep(1000);
            }
        }
    }
}
