package com.github.learn.extend;

public class Dog extends Animals {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void watchDoor(){
        System.out.println("DOgs are watching the door");
    }
}
