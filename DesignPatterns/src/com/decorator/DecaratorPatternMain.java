package com.decorator;

public class DecaratorPatternMain {
	public static void main(String[] args) {
		Gun sniperGun = new SniperGun(new BasicGun());
		sniperGun.assemble();
		System.out.println();
				
		Gun aRGun = new ARGun(new BasicGun());
		aRGun.assemble();
		System.out.println();
		
		Gun sniperARGun = new SniperGun(new ARGun(new BasicGun()));
		sniperARGun.assemble();
		System.out.println();
			
	}
}


