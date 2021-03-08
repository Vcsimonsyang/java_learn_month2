package com.github.learn.TCPIP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.33",10000);
        OutputStream os = s.getOutputStream();
        os.write("this is a test".getBytes());

        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("服务器说：" + data);

        os.close();
        is.close();
        s.close();

    }
}
