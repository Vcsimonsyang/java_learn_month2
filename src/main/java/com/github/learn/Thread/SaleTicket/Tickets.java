package com.github.learn.Thread.SaleTicket;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Tickets implements Runnable {
    private static int tickets = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
//            synchronized(this){
//                sale();
////                if (tickets > 0) {
////                    try {
////                        Thread.sleep(100);
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
////                    System.out.println(Thread.currentThread().getName() + "  is selling No." + tickets + "  tickets.");
////                    tickets--;
////                }else{
////                    break;
////                }
//            }
            lock.lock();
            try{
                sale();
            }finally{
                lock.unlock();
            }

        }
    }
    public static synchronized void sale(){
        if(tickets > 0){
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "  is selling No." + tickets + "  tickets.");
            tickets--;
        }else{
            System.exit(0);
        }
    }
}

