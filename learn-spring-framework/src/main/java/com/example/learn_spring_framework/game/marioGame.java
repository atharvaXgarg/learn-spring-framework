package com.example.learn_spring_framework.game;

import com.example.learn_spring_framework.GamingConsole;

public class marioGame implements GamingConsole {
public void up(){
    System.out.println("Jump");
}
public void down(){
    System.out.println("Go into a hole");
}
public void left(){
    System.out.println("Go back" );
}
public void right(){
    System.out.println("accelerate");
}
}
