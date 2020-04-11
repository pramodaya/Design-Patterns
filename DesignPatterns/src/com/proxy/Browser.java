package com.proxy;

public class Browser {

	public static void main(String[] args) {
	
		WebPageProxy webPageProxy = new WebPageProxy();
		webPageProxy.renderPage("www.youtube.com");
		webPageProxy.renderPage("www.facebook.com");
		
	}

}



