package com.atika.spring.demo.springdemo.game;

import org.springframework.stereotype.Component;


public class SuperContraGame implements GameConsole{
    public void up(){
        System.out.println("SUPER UP");
    }

    public void down(){
        System.out.println("SUPER DOWN");
    }

    public void left(){
        System.out.println("SUPER LEFT");
    }

    public void right(){
        System.out.println("SUPER RIGHT");
    }
}
