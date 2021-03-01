package com.github.learn.Thread.P_C_module;

public class Box{
    private int milk;
    private boolean status = false;

    public synchronized void store(int milk){
        if(status){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("milkman put " + this.milk + " bottles of milk in the box");
        status = true;
        notifyAll();
    }
    public synchronized void get(){
        if(!status){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("customer get the " + milk + "bottle of milk from the box");
        }
        status = false;
        notifyAll();
    }
}
