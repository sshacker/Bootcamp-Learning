package com.ttn.bootcamp.demospringframeworkproject1.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("SuperContraGame: Up");
    }
    public void down(){
        System.out.println("SuperContraGame: down");
    }
    public void left(){
        System.out.println("SuperContraGame: down");
    }
    public void right(){
        System.out.println("SuperContraGame: right");
    }
}
