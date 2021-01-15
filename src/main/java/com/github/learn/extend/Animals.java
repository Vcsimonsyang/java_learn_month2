package com.github.learn.extend;

public class Animals {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Animals() {
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
