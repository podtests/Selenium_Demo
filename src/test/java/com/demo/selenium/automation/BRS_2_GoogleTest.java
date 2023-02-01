package com.demo.selenium.automation;

import com.demo.selenium.automation.dao.GoogleHomePage_DAO;
import com.demo.selenium.automation.pom.GoogleHomePage_POM;
import com.demo.selenium.automation.util.ui.ConfigDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class BRS_2_GoogleTest {

	GoogleHomePage_POM googleHomePage_POM = new GoogleHomePage_POM();
	
	//open home page
	@Test
	public void SearchText_FaceBook() {
		googleHomePage_POM.GoogleHomePage_POM();
		googleHomePage_POM.openHomePage(ConfigDriver.getInstance().getProperty("url"));
		googleHomePage_POM.fillSearchTextBox(new GoogleHomePage_DAO("Facebook"));
		//googleHomePage_POM.clickGoogleSearchButton();
		
	}

	@AfterClass
	public void tearDown() {
		googleHomePage_POM.closeBrowser();
	}
}
