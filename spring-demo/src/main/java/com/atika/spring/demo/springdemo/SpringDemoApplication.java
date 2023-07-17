package com.atika.spring.demo.springdemo;

import com.atika.spring.demo.springdemo.game.GameConsole;
import com.atika.spring.demo.springdemo.game.GameRunner;
import com.atika.spring.demo.springdemo.game.MarioGame;
import com.atika.spring.demo.springdemo.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		/*
		GameConsole game1 = new MarioGame();
		GameRunner runner = new GameRunner(game1);
		runner.run();
		GameConsole game2 = new SuperContraGame();
		GameRunner runner2 = new GameRunner(game2);
		runner2.run();*/

		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
	}

}
