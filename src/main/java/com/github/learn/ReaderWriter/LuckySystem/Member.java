package com.github.learn.ReaderWriter.LuckySystem;

public class Member {
    private String name;
    private int age;
    private String workNumber;

    public Member() {
    }

    public Member(String name, int age, String workNumber) {
        this.name = name;
        this.age = age;
        this.workNumber = workNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }
}
