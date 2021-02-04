package com.github.learn.collectionPractice;

import java.util.ArrayList;
import java.util.Collection;

public class practice4 {
    //    五、定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s。
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("s");
        list.add("t");
        list.add("udent");
        System.out.println(listTest(list,"a"));
        System.out.println(listTest(list,"s"));

    }
    public static String listTest(Collection<String> al, String s){
        String result;
        if(al.contains(s)){
            result = "contains";
        }else{
            result = "not exist";
        }
        return result;
    }
}