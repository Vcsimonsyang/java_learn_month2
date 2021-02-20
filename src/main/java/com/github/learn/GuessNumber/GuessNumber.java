package com.github.learn.GuessNumber;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class GuessNumber {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("/Users/lynnyang/work/project/java/java_learn_month2/src/main/java/com/github/learn/GuessNumber/count.txt");
        prop.load(fr);
        fr.close();
        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);
        if(number > 0 ){
            Guess.bingo();
            number--;
            FileWriter fw = new FileWriter("/Users/lynnyang/work/project/java/java_learn_month2/src/main/java/com/github/learn/GuessNumber/count.txt");
            prop.setProperty("count",String.valueOf(number));
            prop.store(fw,null);
        }else{
            System.out.println("you have run out  all the 3 demos please charge if you want to go on");
        }
    }
}
