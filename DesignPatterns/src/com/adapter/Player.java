package com.adapter;

public class Player implements CommonPlayer {

	@Override
	public void shoot() {
		System.out.println("Use the gun to shoot");
	}
	@Override
	public void drive() {
		System.out.println("Drive forward");
	}
	@Override
	public void loot() {
		System.out.println("Loot as you can");
	}
}



