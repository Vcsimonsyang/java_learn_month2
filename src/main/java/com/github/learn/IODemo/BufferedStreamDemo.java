package com.github.learn.IODemo;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {

        long time1 = System.currentTimeMillis();
//        use a total 6.4 MB mov file to test the efficiency of bufferedStream and fileStream;
        method1(); //373 milliseconds;
//        method2(); //52 milliseconds;
//        method3(); //36479 milliseconds;
//        method4();// 125 milliseconds;
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);

    }
    public static void method1() throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/lynnyang/Desktop/test.mov"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/lynnyang/Movies/test.mov"));

        int b;
        while((b = bis.read()) != -1){
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
    public static void method2() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/lynnyang/Desktop/test.mov"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/lynnyang/Movies/test.mov"));

        byte[] bys = new byte[1024];
        int len;
        while((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }
    public static void method3() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/lynnyang/Desktop/test.mov");
        FileOutputStream fos = new FileOutputStream("/Users/lynnyang/Movies/test.mov");
        int b;
        while((b = fis.read()) != -1){
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
    public static void method4() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/lynnyang/Desktop/test.mov");
        FileOutputStream fos = new FileOutputStream("/Users/lynnyang/Movies/test.mov");

        byte[] bys = new byte[1024];
        int len;
        while((len = fis.read(bys)) != -1){
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();
    }

}
