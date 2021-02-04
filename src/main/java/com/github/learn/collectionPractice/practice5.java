package com.github.learn.collectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class practice5 {
//    八、定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(444);
        list.add(223);
        System.out.println(listTest(list,2));
        System.out.println(listTest(list,4));

    }
    public static int listTest(ArrayList<Integer> al,Integer s){
        for(int i =0; i < al.size(); i++){
            if(al.get(i).equals(s)){
                return i;
            }
        }
        return -1;
    }
}
