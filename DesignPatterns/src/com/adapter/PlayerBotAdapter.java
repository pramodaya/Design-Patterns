package com.adapter;

public class PlayerBotAdapter implements CommonPlayer{

	Bot bot ;
	public PlayerBotAdapter(Bot bot) {
		this.bot = bot;
	}	
	@Override
	public void shoot() {
		bot.smashWithHands();	
	}
	@Override
	public void drive() {
		bot.walk();		
	}
	@Override
	public void loot() {
		bot.findAGun();		
	}
}



