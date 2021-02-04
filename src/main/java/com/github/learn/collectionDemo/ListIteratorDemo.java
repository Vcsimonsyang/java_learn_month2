package com.github.learn.collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student s1 = new Student("jackma", 50);
        Student s2 = new Student("ponyMa", 60);
        Student s3 = new Student("robbinLi", 40);
        list.add(s1);
        list.add(s2);
        list.add(s3);
//        use Iterator
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + s.getAge());
        }
        System.out.println("--------");
//         use for loop
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + s.getAge());
        }
        System.out.println("--------");
//        use reinforced "for" loop
        for (Student s : list) {
            System.out.println(s.getName() + s.getAge());
        }
        System.out.println("--------");
//        use ListIterator
        ListIterator<Student> lit = list.listIterator();
        while (lit.hasPrevious()) {
            Student s = lit.previous();

            if (s.getName() == "jackma") {
                Student s4 = new Student("fengqingyang", 90);
                lit.add(s4);
            }
            System.out.println(s.getName() + s.getAge());
            System.out.println(lit);
        }
    }
}
