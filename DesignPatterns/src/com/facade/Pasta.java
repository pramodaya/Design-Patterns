package com.facade;

public class Pasta implements Food {
	
	public String preparedItem;
	
	@Override
	public void prepareFood(String itemRequired) {
		preparedItem = "This is the Pasta with ingredients: "+ itemRequired;
	}

	@Override
	public String deliverFood() {
		return preparedItem;
	}
}




