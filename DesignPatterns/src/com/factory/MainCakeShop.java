package com.factory;

public class MainCakeShop {

	public static void main(String[] args) {
		CakeFactory factory = new CakeFactory();
		
		Cake chocolateCakeObj = factory.makeCakeObject("Chocolate");
		chocolateCakeObj.getCake();
		
		Cake butterCakeObj = factory.makeCakeObject("Butter");
		butterCakeObj.getCake();
		
		Cake velvetCake = factory.makeCakeObject("Velvet");
		velvetCake.getCake();
	}

}


