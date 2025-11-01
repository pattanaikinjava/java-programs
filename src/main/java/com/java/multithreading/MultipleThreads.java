package com.java.multithreading;

public class MultipleThreads implements Runnable
{
    public static void main(String[] args) {
        MultipleThreads aobj = new MultipleThreads();
        /* new state */
        Thread t = new Thread(aobj);
        t.setName("Thread-1-Main");
        t.setPriority(Thread.NORM_PRIORITY);//10

        Thread t2 = new Thread(aobj);
        t2.setName("Thread-2-Main");
        t2.setPriority(Thread.MAX_PRIORITY);//1

        Thread t3 = new Thread(aobj);
        t3.setName("Thread-3-Main");
        t3.setPriority(Thread.MIN_PRIORITY);//5

        /* runnable state */
        t.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e){}
        System.out.println("thread execution ended...");
    }
}
