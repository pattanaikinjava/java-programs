package com.java.multithreading;

public class DemoThread implements  Runnable
{
    public static void main(String[] args) {
        DemoThread demo = new DemoThread();
        Thread t = new Thread(demo);
        t.start();
//        t.start();// we should not start the all threads at same time,
                 // or else we will get IllegalThreadStateException.
    }

    public void run() {
        System.out.println("Thread Name " + Thread.currentThread().getName());
        System.out.println("Sleeping the thread....");
        try {
            Thread.sleep(5000);//sleeping for 5 seconds
            System.out.println("Thread ended...");
        } catch (InterruptedException inex) {
            System.out.println(inex.getCause());
        }
    }
}
