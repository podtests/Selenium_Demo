package com.demo.selenium.automation.util.ui;

public class PageLocatorLoader extends PageLocatorDriver {

	private static PageLocatorLoader locator ;
	
	public static PageLocatorLoader getInstance() {
		
		if (locator == null) {
			
			locator = new PageLocatorLoader();
			
		}
		return locator;
	}
	
	private PageLocatorLoader() {
		super();
	}
	
}
