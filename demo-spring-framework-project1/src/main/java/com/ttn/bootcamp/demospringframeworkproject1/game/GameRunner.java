package com.ttn.bootcamp.demospringframeworkproject1.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    /**
    private MarioGame game;

    public GameRunner(MarioGame game) {
        this.game = game;
    }
    */
    @Autowired
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }
    public void runGame() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
