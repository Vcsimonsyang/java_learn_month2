package com.github.learn.GuessNumber;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
       bingo();
    }
    public static void bingo(){
        Scanner sc = new Scanner(System.in);

        Random rd = new Random();
        int number = rd.nextInt(100);
        System.out.println(number);
        System.out.println("please enter a number between 0 ~ 99");
        int guess = sc.nextInt();
        do{
            if(guess > number ){
                System.out.println("smaller");
                guess = sc.nextInt();
            }else if(guess < number){
                System.out.println("bigger");
                guess = sc.nextInt();
            }
        }while(guess != number);
        System.out.println("bingo");
    }



}
