package com.github.learn.SimpleDateFormateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.Format;

public class tool {
    private tool() {
    }

    public static String dateToString(Date d, String pattern){
        SimpleDateFormat ss = new SimpleDateFormat(pattern);
        String s = ss.format(d);
        return s;
    }

    public static Date stringToDate(String ss, String pattern) throws ParseException {
        SimpleDateFormat s2 = new SimpleDateFormat(pattern);
        Date d = s2.parse(ss);
        return d;
    }

}
