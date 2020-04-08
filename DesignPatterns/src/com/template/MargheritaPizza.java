package com.template;

public class MargheritaPizza extends Pizza{

	@Override
	public void addTheFilling() {
		System.out.println(" tomato sauce, mozzarella, tomatoes, basil add");	
	}

	@Override
	public void takeItFromOven() {
		System.out.println("bake it 15 min");			
	}

}
