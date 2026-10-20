package com.example.learn_spring_framework.game;

import com.example.learn_spring_framework.GamingConsole;

public class pacman implements GamingConsole {

    @Override
    public void down() {
        System.out.println("pacman down");
    }

    @Override
    public void up() {
      System.out.println("pacman up");
    }

    @Override
    public void left() {
        System.out.println("pacman left");
    }

    @Override
    public void right() {
     System.out.println("pacman right");
    }
}
