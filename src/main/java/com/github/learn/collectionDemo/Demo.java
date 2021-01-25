package com.github.learn.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Collection <Student> c = new ArrayList<Student>();
        Student s1 = new Student("Jack",30);
        Student s2 = new Student("Lynn",25);
        Student s3 = new Student("Michael",20);

        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> it = c.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println("name:" + s.getName() + " age:" + s.getAge() );
        }

    }
}
