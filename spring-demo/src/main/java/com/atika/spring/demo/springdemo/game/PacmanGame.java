package com.atika.spring.demo.springdemo.game;

import org.springframework.stereotype.Component;

public class PacmanGame implements GameConsole{
    public void up(){
        System.out.println("PACMAN UP");
    }

    public void down(){
        System.out.println("PACMAN DOWN");
    }

    public void left(){
        System.out.println("PACMAN LEFT");
    }

    public void right(){
        System.out.println("PACMAN RIGHT");
    }
}
