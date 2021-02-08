package com.github.learn.IODemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FIleInputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/lynnyang/work/project/java/java_learn_month2/src/main/java/com/github/learn/IODemo/test.txt");
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write("hello world this is simons,here".getBytes());
        fos.close();
        FileInputStream fis = new FileInputStream(file);
        byte[] bys = new byte[1024];
        int len;
        while( (len = fis.read(bys)) != -1){
            System.out.println(new String(bys,0,len));
        }
        fis.close();
    }
}
