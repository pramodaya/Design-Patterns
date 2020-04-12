package com.decorator;

public class GunDecorator implements Gun {
	
	protected Gun gun;
	
	public GunDecorator(Gun gun) {
		this.gun = gun;
	}
	
	@Override
	public void assemble() {
		this.gun.assemble();
	}
}


