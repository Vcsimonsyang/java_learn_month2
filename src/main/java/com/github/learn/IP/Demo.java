package com.github.learn.IP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getByName("127.0.0.1");
        System.out.println(ia.getHostName());

    }
}
