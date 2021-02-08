package com.github.learn.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Student> hm = new HashMap<>();
        Student s1 = new Student("Jack",30);
        Student s2 = new Student("Michael",33);
        Student s3 = new Student("Jane",35);
        Student s4 = new Student("John",38);
        Student s5 = new Student("Alan",45);
        hm.put("西安",s1);
        hm.put("Beiging",s2);
        hm.put("Tianjing",s3);
        hm.put("Shanghai", s4);
        hm.put("changsha", s5);

        Set<Map.Entry<String,Student>> set = hm.entrySet();
        for(Map.Entry<String,Student> me: set){
            System.out.println(me.getValue().getName() + "," + me.getValue().getAge() + "," + me.getKey());
        }



    }
}
