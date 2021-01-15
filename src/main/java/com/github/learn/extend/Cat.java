package com.github.learn.extend;

public class Cat extends Animals{
    public Cat(){}
    public Cat(String name, int age){
        super(name,age);
    }
    public void catchMouse (){
        System.out.println("cats are catching mouse");
    }


}
