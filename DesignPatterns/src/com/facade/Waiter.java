package com.facade;

public class Waiter {
	public static String deliverFood(String foodType) {
		Ingredients ingredients = new Ingredients();
		
		switch(foodType) {
		case "Pizza" : 
			Food pizza = new Pizza();
			String pizzaItems = ingredients.getPizzaItems();
			pizza.prepareFood(pizzaItems);
			return pizza.deliverFood();
			
		case "Pasta" : 		
			Food pasta = new Pasta();
			String pastaItems = ingredients.getPastaItems();
			pasta.prepareFood(pastaItems);
			return pasta.deliverFood();	
			
		}
		return null;
	}
}





