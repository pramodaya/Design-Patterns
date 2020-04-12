package com.decorator;

public class SniperGun extends GunDecorator{

	public SniperGun(Gun gun) {
		super(gun);
	}

	@Override 
	public void assemble() {
		super.assemble();
		System.out.println("Adding Sniper Gun Features");
	}
}




