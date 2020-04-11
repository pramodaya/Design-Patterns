package com.proxy;

public class WebPageProxy implements WebPage {

	private WebPage webPage;
	
	public WebPageProxy() {
		this.webPage = new WebPageImpl();
	}
	
	@Override
	public void renderPage(String pageUrl) {
		if(pageUrl.equalsIgnoreCase("www.youtube.com")) {
			System.out.println("The site has been blocked by the ISP");
		}else {
			webPage.renderPage(pageUrl);
		}
	}
}



