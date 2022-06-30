package com.ttn.bootcamp.demospringframeworkproject1;

import com.ttn.bootcamp.demospringframeworkproject1.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpringFrameworkProject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoSpringFrameworkProject1Application.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.runGame();
	}

}
