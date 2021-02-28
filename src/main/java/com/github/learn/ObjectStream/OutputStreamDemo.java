package com.github.learn.ObjectStream;

import java.io.*;
import java.util.ArrayList;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/lynnyang/work/project/java/java_learn_month2/src/main/java/com/github/learn/ObjectStream/student.txt"));
        Student s1 = new Student("jack ma",50);
        Student s2 = new Student("pony ma",45);
        Student s3 = new Student("rubin",43);
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/lynnyang/work/project/java/java_learn_month2/src/main/java/com/github/learn/ObjectStream/student.txt"));
        ArrayList<Object> al = new ArrayList<>();
        try{
            while(true){
                al.add(ois.readObject());
            }
        }catch(EOFException e){
            e.printStackTrace();
        }
        for(Object o: al){
            Student s = (Student)o;
            System.out.println(s.getName()+","+s.getAge());
        }

    }
}
