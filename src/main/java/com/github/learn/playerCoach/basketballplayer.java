package com.github.learn.playerCoach;

public class basketballplayer extends player {
    @Override
    public void learn() {
        System.out.println("篮球运动员学习运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃牛肉，喝牛奶");
    }

    public basketballplayer() {
    }

    public basketballplayer(String name, int age) {
        super(name, age);
    }
}
