package com.github.learn.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
//        需求：用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
//        要求：按照总分从高到低出现
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.sum() - s1.sum();
                int num2 = num == 0 ? s2.getMath() - s1.getMath() : num;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;

            }
        });
        Student s1 = new Student("Jack", 100, 90);
        Student s2 = new Student("Mary", 90, 99);
        Student s3 = new Student("Michael", 92, 93);
        Student s4 = new Student("Tom", 88, 90);
        Student s5 = new Student("Rose", 97, 98);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for(Student s : ts){
            System.out.println(s.getName() + ": sum: " + s.sum() +", " + s.getChinese() + "," + s.getMath() );
        }


    }
}
