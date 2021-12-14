package com.company;

import java.util.Random;

public class JoinExample implements Runnable{
    private Random rand= new Random(System.currentTimeMillis());
    @Override
    public void run() {
        for(int i=0;i<10000000;i++){
            rand.nextInt();
        }
        System.out.println("[" + Thread.currentThread().getName() + "] finished");

    }
}
