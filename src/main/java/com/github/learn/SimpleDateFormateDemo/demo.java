package com.github.learn.SimpleDateFormateDemo;

import java.text.ParseException;
import java.util.Date;

public class demo {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        String s = tool.dateToString(d1, "yyyyMMDD HH:mm:ss");
        System.out.println(s);

        String s2 = "20481225";
        Date d2 = tool.stringToDate(s2,"yyyymmdd");
        System.out.println(d2);
    }
}
