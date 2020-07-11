package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.genericlib.BaseClass;
import com.inetbanking.pageobjects.LoginPage;

public class TC_LoginPage_001 extends BaseClass {

	@Test
	public void loginPageTests() {
	
		LoginPage lp=new LoginPage(driver);
		
		lp.set_Username(username);
		log.info("username entered");
		lp.set_Password(password);
		log.info("password entered");
		lp.clickOnLoginBtn();
		
		Assert.assertEquals(driver.getTitle(), "GTPL Bank Manager HomePage");
		log.info("login page tests passed");
		
	}
	
}
