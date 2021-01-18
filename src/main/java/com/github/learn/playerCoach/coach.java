package com.github.learn.playerCoach;

public abstract class coach extends human {

    public abstract void teach();

    public coach() {
    }

    public coach(String name, int age) {
        super(name, age);
    }
}
