package com.github.learn.playerCoach;

public class pingpangcoach extends coach implements SpeakEnglish {
    @Override
    public void teach() {
        System.out.println("乒乓球教练教接发球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃大白菜喝小米粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }

    public pingpangcoach() {
    }

    public pingpangcoach(String name, int age) {
        super(name, age);
    }
}
