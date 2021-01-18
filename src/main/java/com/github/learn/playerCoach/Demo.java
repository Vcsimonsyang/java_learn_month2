package com.github.learn.playerCoach;

public class Demo {
    public static void main(String[] args) {
//      篮球教练测试
        basketballcoach bc = new basketballcoach();
        bc.setAge(55);
        bc.setName("杰克逊");
        System.out.println(bc.getName() + "," + bc.getAge());
        bc.teach();
        bc.eat();

        basketballcoach bc2 = new basketballcoach("杰克逊", 55);
        System.out.println(bc2.getName() + "," + bc2.getAge());
        bc2.teach();
        bc2.eat();
//      篮球运动员测试
        basketballplayer bp = new basketballplayer();
        bp.setName("科比");
        bp.setAge(25);
        System.out.println(bp.getName() + "," + bp.getAge());
        bp.learn();
        bp.eat();

        basketballplayer bp2 = new basketballplayer("科比",25);
        System.out.println(bp2.getName() + "," + bp.getAge());
        bp2.learn();
        bp2.eat();

//      pingpangcoach Test
        pingpangcoach ppc = new pingpangcoach();
        ppc.setName("胖子");
        ppc.setAge(45);
        System.out.println(ppc.getName() + "," + ppc.getAge());
        ppc.eat();
        ppc.teach();
        ppc.speak();

        pingpangcoach ppc2 = new pingpangcoach("胖子",45);
        System.out.println(ppc2.getName() + "," + ppc2.getAge());
        ppc2.eat();
        ppc2.teach();
        ppc2.speak();

//        pingpangplayer Test
        pingpangplayer ppp = new pingpangplayer();
        ppp.setName("张继科");
        ppp.setAge(23);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.learn();
        ppp.eat();
        ppp.speak();

        pingpangplayer ppp2 = new pingpangplayer("张继科",23);
        System.out.println(ppp2.getName() + "," + ppp2.getAge());
        ppp2.learn();
        ppp2.eat();
        ppp2.speak();
    }
}
