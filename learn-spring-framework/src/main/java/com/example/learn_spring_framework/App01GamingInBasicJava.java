package com.example.learn_spring_framework;

import com.example.learn_spring_framework.game.*;


public class App01GamingInBasicJava {
    static void main() {
       //.....................//
       var game1 =new marioGame();
       var gr=new gameRunner(game1);
       gr.run();
       System.out.println();
       //.............................//
       var Game2 =new superContraGame();
       gr=new gameRunner(Game2);
       gr.run();
       System.out.println();
       //.............................//
       var Game3 =new pacman();
       gr=new gameRunner(Game3);
       gr.run();
    }
}
