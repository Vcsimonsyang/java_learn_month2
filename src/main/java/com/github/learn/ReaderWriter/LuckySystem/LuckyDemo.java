package com.github.learn.ReaderWriter.LuckySystem;

import java.io.*;
import java.util.*;

public class LuckyDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<Member> ts = new ArrayList<>();

        Member m1 = new Member("Jack", 23, "sales001");
        Member m2 = new Member("Pony", 24, "sales002");
        Member m3 = new Member("Adam", 33, "sales003");
        Member m4 = new Member("Brush", 35, "sales004");
        Member m5 = new Member("Clark", 40, "sales005");
        Member m6 = new Member("David", 34, "sales006");
        Member m7 = new Member("Jane", 56, "Tech001");
        Member m8 = new Member("Michael", 51, "Tech002");
        Member m9 = new Member("Nick", 37, "Tech003");
        Member m10 = new Member("Tom", 39, "Tech004");
        Member m11 = new Member("Jerry", 20, "HR001");
        Member m12 = new Member("Young", 29, "HR002");
        Member m13 = new Member("Simons", 49, "HR003");
        Member m14 = new Member("lynn", 40, "HR005");

        ts.add(m1);
        ts.add(m2);
        ts.add(m3);
        ts.add(m4);
        ts.add(m5);
        ts.add(m6);
        ts.add(m7);
        ts.add(m8);
        ts.add(m9);
        ts.add(m10);
        ts.add(m11);
        ts.add(m12);
        ts.add(m13);
        ts.add(m14);

        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/lynnyang/work/project/java/java_learn_month2/src/main/java/com/github/learn/ReaderWriter/LuckySystem/Member.txt"));
        //use a Treemap to store all the worknumber;
        TreeMap<Integer, Member> tm = new TreeMap<>();
        int index = 0;
        for (Member s : ts) {
            StringBuilder sb = new StringBuilder();
            tm.put(index, s);
            sb.append(s.getName()).append(",").append(s.getWorkNumber()).append(",").append(s.getAge());
            bw.write(sb.toString(), 0, sb.toString().length());
            bw.newLine();
            bw.flush();
            index++;
        }
        bw.close();
        Random rd = new Random();
        int luckyIndex = rd.nextInt(ts.size());
        System.out.println(luckyIndex);
        Member luckym = ts.get(luckyIndex);
        BufferedWriter bw2 = new BufferedWriter(new FileWriter("/Users/lynnyang/work/project/java/java_learn_month2/src/main/java/com/github/learn/ReaderWriter/LuckySystem/LuckyOne.txt"));
        StringBuilder luckys = new StringBuilder();
        luckys.append(luckym.getWorkNumber()).append(",").append(luckym.getName()).append(",").append(luckym.getAge());
        System.out.println(luckys);
        bw2.write(luckys.toString(), 0, luckys.toString().length());
        bw2.flush();
        bw2.close();

    }
}
