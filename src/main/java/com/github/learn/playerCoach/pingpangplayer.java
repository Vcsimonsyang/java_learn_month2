package com.github.learn.playerCoach;

public class pingpangplayer extends player implements SpeakEnglish {
    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃大白菜，喝小米粥");
    }

    @Override
    public void learn() {
        System.out.println("乒乓球运动员学习接发球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }

    public pingpangplayer() {
    }

    public pingpangplayer(String name, int age) {
        super(name, age);
    }

}
