package com.github.learn.DateFabruary;

import java.util.Calendar;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year");

        int year = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);
        c.add(Calendar.DATE, -1);
        int date = c.get(Calendar.DATE);
        System.out.println(year + " year has " + date +" days");
    }
}
