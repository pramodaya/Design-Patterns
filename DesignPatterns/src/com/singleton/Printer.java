package com.singleton;

public class Printer {
	
	//create a private printer property
	private static Printer printer;
	
	//make private constructor so then no one cannot create instances of this
	private Printer() {
		System.out.println("Printer is created");
	}
	
	//get the printer object method
	public static Printer getInstance() {
		if(printer == null) {
			printer = new Printer();
			return printer;
		}else {
			System.out.println("Existing printer instance is returned");
			return printer;
		}
		
	}
	
}



