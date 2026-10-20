package com.example.learn_spring_framework.game;

import com.example.learn_spring_framework.GamingConsole;

public class gameRunner {
    private final GamingConsole Game;
    public gameRunner(GamingConsole Game) {
        this.Game=Game;
    }


    public void run() {
        System.out.println("Running game: "+Game);
        Game.down();
        Game.up();
        Game.left();
        Game.right();
    }
}
