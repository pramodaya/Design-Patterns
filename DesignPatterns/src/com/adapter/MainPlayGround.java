package com.adapter;

public class MainPlayGround {

	public static void main(String[] args) {
		CommonPlayer player = new Player();
		Bot bot = new Bot();
		CommonPlayer playerBotAdapter = new PlayerBotAdapter(bot);
		
		System.out.println("---- Player----");
		player.shoot();
		player.drive();
		player.loot();
		System.out.println("---- Bot----");
		bot.smashWithHands();
		bot.walk();
		bot.findAGun();
		System.out.println("---- PlayerBot----");
		playerBotAdapter.shoot();
		playerBotAdapter.drive();
		playerBotAdapter.loot();		

	}
}



