package com.inetbanking.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.genericlib.BaseClass;
import com.inetbanking.pageobjects.HomePage;
import com.inetbanking.pageobjects.LoginPage;
import com.inetbanking.utilities.XLUtils;
import com.inetbanking.utilities.general;

public class TC_LoginDDT_002 extends BaseClass {

	@Test(dataProvider = "LoginData",dataProviderClass = general.class, groups = {"lok"})
	public void LoginDDT(String un,String pwd) {
		
		LoginPage lp=new LoginPage(driver);
		lp.set_Username(un);
		log.info("username entered");
		lp.set_Password(pwd);
		log.info("password entered");
		lp.clickOnLoginBtn();
		general.wait(3);
		
		if(general.isAlertPresent()) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			log.warn("invalid credentials");
		}else {
			general.wait(3);
			new HomePage(driver).clickOnLogoutBtn();
			general.wait(3);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			log.info("valid credentials");
		}
	}	
}
