package com.demo.selenium.automation.util.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebControls {

	public void openURL(WebDriver wd , String url) {
		
		wd.get(url);
		
	}
	
	public void click(WebElement element) {
		
		element.click();
	}
	
	public void sendKeys(WebElement element, String text) {
		
		element.sendKeys(text);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
}
