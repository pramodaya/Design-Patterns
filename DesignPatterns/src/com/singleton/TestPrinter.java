package com.singleton;

public class TestPrinter {
	public static void main(String[] args) {
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		Printer p3 = Printer.getInstance();
	}
}








