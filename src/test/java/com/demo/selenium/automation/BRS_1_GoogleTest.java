package com.demo.selenium.automation;

import org.testng.annotations.Test;

import com.demo.selenium.automation.dao.GoogleHomePage_DAO;
import com.demo.selenium.automation.pom.GoogleHomePage_POM;
import com.demo.selenium.automation.util.ui.ConfigDriver;


public class BRS_1_GoogleTest {

	GoogleHomePage_POM googleHomePage_POM = new GoogleHomePage_POM();
	
	//open home page
	@Test
	public void TC1_testSearchFunctionality() {
						
		googleHomePage_POM.openHomePage(ConfigDriver.getInstance().getProperty("url"));
		googleHomePage_POM.fillSearchTextBox(new GoogleHomePage_DAO("protractor"));
		//googleHomePage_POM.clickGoogleSearchButton();
		
	}
}
