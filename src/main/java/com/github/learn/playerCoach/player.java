package com.github.learn.playerCoach;

public abstract class player extends human {

    public abstract void learn();

    public player() {
    }

    public player(String name, int age) {
        super(name, age);
    }

}
