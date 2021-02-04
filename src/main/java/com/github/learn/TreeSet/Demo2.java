package com.github.learn.TreeSet;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
//        需求：编写一个程序，获取10个1-20之间的随机数，要求随机数不能重复，并在控制台输出
//       create a collection.
        Set<Integer> hs = new HashSet<>();

//        create a random object
        Random n = new Random();

        while(hs.size() < 10) {
            int number = n.nextInt(20) + 1;
            hs.add(number);
        }
        for(int i : hs){
            System.out.println(i);
        }
        System.out.println("------------");
        Set<Integer> hs2 = new TreeSet<>();

        Random n2 = new Random();
        while(hs2.size() < 10){
            int number2 = n2.nextInt(20) + 1;
            hs2.add(number2);
        }
        for(int i : hs2){
            System.out.println(i);
        }
    }

}
