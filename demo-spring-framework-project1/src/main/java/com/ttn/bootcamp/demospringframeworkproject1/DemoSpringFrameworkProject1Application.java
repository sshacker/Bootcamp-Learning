package com.ttn.bootcamp.demospringframeworkproject1;

import com.ttn.bootcamp.demospringframeworkproject1.game.GameRunner;
import com.ttn.bootcamp.demospringframeworkproject1.game.GamingConsole;
import com.ttn.bootcamp.demospringframeworkproject1.game.MarioGame;
import com.ttn.bootcamp.demospringframeworkproject1.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringFrameworkProject1Application {

	public static void main(String[] args) {
		// SpringApplication.run(DemoSpringFrameworkProject1Application.class, args);

		// MarioGame game = new MarioGame();
		// SuperContraGame game = new SuperContraGame();

		GamingConsole game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.runGame();
	}

}
