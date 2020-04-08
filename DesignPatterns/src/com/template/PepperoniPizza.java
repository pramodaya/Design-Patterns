package com.template;

public class PepperoniPizza extends Pizza{

	@Override
	public void addTheFilling() {
		System.out.println(" marinara sauce,pepperoni, mozzarella, Parmesan");
		
	}

	@Override
	public void takeItFromOven() {
		System.out.println("bake it 17 min");	
		
	}

}
