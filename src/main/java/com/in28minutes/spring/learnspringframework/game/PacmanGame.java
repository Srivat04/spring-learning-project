package com.in28minutes.spring.learnspringframework.game;

public class PacmanGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Pacman turns up!");
		
	}

	@Override
	public void down() {
		System.out.println("Pacman turns down!");
	}

	@Override
	public void left() {
		System.out.println("Pacman turns left!");
		
	}

	@Override
	public void right() {
		System.out.println("Pacman turns right!");
		
	}
	

}
