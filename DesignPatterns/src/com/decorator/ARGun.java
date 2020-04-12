package com.decorator;

public class ARGun extends GunDecorator{

	public ARGun(Gun gun) {
		super(gun);
	}

	@Override 
	public void assemble() {
		super.assemble();
		System.out.println("Adding AR Gun Features");
	}	
}





