package com.github.learn.collectionPractice;

import java.util.ArrayList;
import java.util.Collection;

public class practice3 {
    //    定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add((Integer) 1);
        list.add((Integer) 3);
        list.add((Integer) 4);
        list.add((Integer) 6);
        list.add((Integer) 7);

        System.out.println(toArray(list));
    }

    public static Object toArray(Collection<Integer> list) {
        Object[] arr = new Object[list.size()];
        for (Integer i : list) {
            if (arr.length < 1) {
                arr[0] = i;
            } else {
                arr[arr.length - 1] = i;
            }

        }
        return arr;
    }
}
