package com.github.learn.extend;

public class Demo {
    public static void main(String[] args){
        Cat c1 = new Cat();
        c1.setName("Coffee");
        c1.setAge(5);
        System.out.println(c1.getName() + "," + c1.getAge());
        c1.catchMouse();

        Cat c2 = new Cat("Coffee", 5);
        System.out.println(c2.getName() + "," + c2.getAge());
        c2.catchMouse();

        Dog dog1 = new Dog("Wangwang", 10);
        System.out.println(dog1.getName() + "," + dog1.getAge());
        dog1.watchDoor();

        Dog dog2 = new Dog();
        dog2.setName("wangwang");
        dog2.setAge(10);
        System.out.println(dog2.getName() + "," + dog2.getAge());
        dog2.watchDoor();
    }
}
