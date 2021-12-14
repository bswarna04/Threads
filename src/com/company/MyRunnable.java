package com.company;

public class MyRunnable implements Runnable{

    public void run() {

        while(true){
            System.out.println("Before Sleep");
         //   doSomething();
            try{
                Thread.sleep(Long.MAX_VALUE);
            }catch(InterruptedException e){
                System.out.println("Thread Interrupted");
             //   e.printStackTrace();
            }
            System.out.println("After Sleep");
        }
       // System.out.println(("Executing thread: " + Thread.currentThread().getName()));

    }
    public void doSomething(){
        System.out.println("Running");
    }
}
