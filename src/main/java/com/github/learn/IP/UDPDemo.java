package com.github.learn.IP;

import java.io.IOException;
import java.net.*;

public class UDPDemo {
    public static void main(String[] args) throws IOException {
//        DatagramSocket ds = new DatagramSocket();
//        byte[] bys = "hello world".getBytes();
//        DatagramPacket dp = new DatagramPacket(bys, bys.length,InetAddress.getByName("127.0.0.1"),10086);
//        ds.send(dp);
//        ds.close();
        DatagramSocket ds = new DatagramSocket(12306);
        while(true){
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys,bys.length);
            ds.receive(dp);
            System.out.println(new String(dp.getData(),0,dp.getLength()));
        }

    }
}
