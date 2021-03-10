package com.github.learn.TCPIP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.6",10086);
        OutputStream os = s.getOutputStream();
        byte[] bys = "this is another test".getBytes();

    }
}
