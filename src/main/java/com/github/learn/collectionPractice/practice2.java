package com.github.learn.collectionPractice;

import java.util.ArrayList;
import java.util.Collection;

public class practice2 {
//    三、定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。
    public static Collection arrayTraslate(int[] arr){
        Collection<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            list.add((Integer)arr[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 43, 4, 34};
        System.out.println(arr);
        System.out.println(arrayTraslate(arr));
    }
}
