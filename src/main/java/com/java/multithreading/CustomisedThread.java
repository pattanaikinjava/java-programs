package com.java.multithreading;

public class CustomisedThread  implements  Runnable {
       //extends Thread {
    public static void main(String[] args) {
        CustomisedThread cobj = new CustomisedThread();
        Thread t = new Thread(cobj);
        t.start(); //  A new object is responsible for creating thread. i.e Thread-0
//        t.run(); // main thread is pointing to current thread.
    }

    public void run(){
        System.out.println("current thread name "+Thread.currentThread().getName());
        System.out.println("Implementing Runnable Interface , run method is invoked...");
//        System.out.println("Extending thread class , run method is invoked...");
    }

    /*
     So, here CustomisedThread class object is created which is runnable object for Thread class.
     JVM internally creates a new thread object and calls run() method internally of the
     Runnable Object.
    */

}
