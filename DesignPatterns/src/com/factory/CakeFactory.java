package com.factory;

public class CakeFactory {
	
	public Cake makeCakeObject(String cakeType) {		
		Cake cake = null;
		
		if(cakeType.toLowerCase().equals("chocolate")) {
			cake = new ChocolateCake();
		}else if(cakeType.toLowerCase().equals("butter")) {
			cake = new ButterCake();
		}else if(cakeType.toLowerCase().equals("velvet")) {
			cake = new VelvetCake();
		}else {
			System.out.println("we dont make that cake");
		}
		
		return cake;
	}
}



