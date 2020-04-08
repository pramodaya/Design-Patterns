package com.template;

public abstract class Pizza {
	//call the functions by order (algorithm)
	public void makeThePizza() {
		makeTheDoe();
		letTheDoeRest();
		stretchIt();
		addTheFilling();
		inToTheOven();
		takeItFromOven();
	}
	
	public void makeTheDoe() {
		System.out.println("Make the pizza doe");
	}
	public void letTheDoeRest() {
		System.out.println("Let the pizza doe to rest");
	}
	public void stretchIt() {
		System.out.println("Stretch the doe");
	} 	
	//subclasses should define how this works 
	public abstract void addTheFilling();
	
	public void inToTheOven() {
		System.out.println("Put it into the oven");
	}
	//subclasses should define how this works 
	public abstract void takeItFromOven();
}
