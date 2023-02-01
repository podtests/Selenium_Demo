package com.demo.selenium.automation.util.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserDriver {

	private static WebDriver wd;
	
	public static WebDriver getInstance() {
		
		if (wd == null ) {
			System.out.println("wd is null in If block");
			 if (ConfigDriver.getInstance().getProperty("browser").equals("Chrome")) {
				 System.out.println("In if "+ ConfigDriver.getInstance().getProperty("browser"));
				 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\Drivers\\chromedriver.exe");
				 wd = new ChromeDriver();
			 }
			 else if (ConfigDriver.getInstance().getProperty("Browser") =="Firefox") {
				 wd = new FirefoxDriver();
			 }
			 else if (ConfigDriver.getInstance().getProperty("Browser") =="IE") {
				 wd = new InternetExplorerDriver();
			 }		
		}
		else System.out.println("No instance of wd");
		return wd;
	}
	
	private BrowserDriver() {
		
	}

	public static void nullInstance() {
		wd.close();
		wd = null;
	}
	
}
