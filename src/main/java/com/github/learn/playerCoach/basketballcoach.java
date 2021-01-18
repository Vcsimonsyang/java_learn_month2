package com.github.learn.playerCoach;

public class basketballcoach extends coach {
    @Override
    public void teach() {
        System.out.println("篮球教练教运球和头投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉喝羊奶");
    }

    public basketballcoach() {
    }

    public basketballcoach(String name, int age) {
        super(name, age);
    }

}
