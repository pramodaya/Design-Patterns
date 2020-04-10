package com.facade;

public class Pizza implements Food {
	public String preparedItem;
	
	@Override
	public void prepareFood(String itemRequired) {
		preparedItem = "This is the Pizza with ingredients: "+ itemRequired;
	}

	@Override
	public String deliverFood() {
		return preparedItem;
	}

}



