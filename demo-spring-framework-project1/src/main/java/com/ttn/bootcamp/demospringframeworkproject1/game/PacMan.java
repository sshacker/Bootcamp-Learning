package com.ttn.bootcamp.demospringframeworkproject1.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacMan implements GamingConsole {

    public void up(){ System.out.println("PacMan: Up"); }
    public void down(){
        System.out.println("PacMan: down");
    }
    public void left(){
        System.out.println("PacMan: down");
    }
    public void right(){
        System.out.println("PacMan: right");
    }
}
