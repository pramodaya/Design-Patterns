package com.proxy;

public class WebPageImpl implements WebPage {

	@Override
	public void renderPage(String pageUrl) {
		System.out.println(pageUrl +" rendered succeeded");

	}

}



