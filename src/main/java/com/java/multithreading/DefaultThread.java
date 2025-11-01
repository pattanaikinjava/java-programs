package com.java.multithreading;

public class DefaultThread
{
    // Thread is predefined class, containing a static method i.e currentThread().

    public static void main(String[] args) {
        System.out.println( "default thread is "+
                Thread.currentThread().getName()
        );
    }
}
