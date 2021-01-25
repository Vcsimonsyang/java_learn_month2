package com.github.learn.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student s1 = new Student("lynn", 20);
        Student s2 = new Student("jack", 25);
        Student s3 = new Student("Michael", 18);

        list.add(s1);
        list.add(s2);
        list.add(s3);

//        use iterator()
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + s.getAge());
        }

//        use for loop to iterate
        System.out.println("------------");
        for(int i = 0; i < list.size(); i++){
            Student s = list.get(i);
            System.out.println(s.getName() + s.getAge());
        }

    }
}
