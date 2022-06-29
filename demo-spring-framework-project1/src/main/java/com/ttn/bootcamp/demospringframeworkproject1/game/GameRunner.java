package com.ttn.bootcamp.demospringframeworkproject1.game;

public class GameRunner {

    /**
    private MarioGame game;

    public GameRunner(MarioGame game) {
        this.game = game;
    }
    */
    private SuperContraGame game;

    public GameRunner(SuperContraGame game) {
        this.game = game;
    }
    public void runGame() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
