package com.demo.selenium.automation.pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.demo.selenium.automation.dao.GoogleHomePage_DAO;
import com.demo.selenium.automation.util.ui.BrowserDriver;
import com.demo.selenium.automation.util.ui.PageLocatorDriver;
import com.demo.selenium.automation.util.ui.PageLocatorLoader;
import com.demo.selenium.automation.util.ui.WebControls;

public class GoogleHomePage_POM {

	public WebDriver wd;
	public Properties property;
	public WebControls browser;
	
	
	
	public GoogleHomePage_POM() {
		
		wd = BrowserDriver.getInstance();
		property = PageLocatorLoader.getInstance().getPropertyInstance();
		browser = new WebControls();
		
		try {
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\Resources\\PageLocators\\GoogleHomePage.properties");
			property.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void openHomePage(String url) {
		System.out.println("url is: "+url);
		System.out.println("wd is : "+wd.toString());
		browser.openURL(wd, url);
	}
	
	public void fillSearchTextBox(GoogleHomePage_DAO dao) {
		browser.sendKeys(wd.findElement(By.xpath(property.getProperty("SearchBox_TB_xpath"))), dao.getSearchText());		
	}
	
	public void clickGoogleSearchButton() {
		browser.click(wd.findElement(By.xpath(property.getProperty("GoogleSearch_Btn_xpath"))));
	}
	
}
