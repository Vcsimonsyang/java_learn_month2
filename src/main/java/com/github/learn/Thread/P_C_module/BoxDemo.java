package com.github.learn.Thread.P_C_module;

public class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box();
        Producer pd = new Producer(b);
        Customer cs = new Customer(b);
        Thread td1 = new Thread(pd);
        Thread td2 = new Thread(cs);
        td1.start();
        td2.start();
    }
}
