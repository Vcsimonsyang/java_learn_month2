package com.github.learn.Thread.SaleTicket;

public class SaleTicketsDemo {
    public static void main(String[] args) {
        Tickets ticket = new Tickets();
        Thread td1 = new Thread(ticket,"Window1");
        Thread td2 = new Thread(ticket,"Window2");
        Thread td3 = new Thread(ticket,"Window3");
        td3.start();
        td1.start();
        td2.start();

    }
}
