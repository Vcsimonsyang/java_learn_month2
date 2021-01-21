package com.github.learn.commanclass;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date d1 = new Date();
        long l1 = System.currentTimeMillis();
        System.out.println(d1.getTime());
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long l2 = System.currentTimeMillis();
        System.out.println(l2 - l1);
        long d2 = d1.getTime();
        System.out.println(d2);
    }
}
