package com.inetbanking.testcases;

import org.testng.annotations.Test;

import com.inetbanking.genericlib.BaseClass;
import com.inetbanking.pageobjects.HomePage;
import com.inetbanking.pageobjects.LoginPage;
import com.inetbanking.pageobjects.NewCustomerpage;
import com.inetbanking.utilities.general;

public class TC_NewCustomer_003 extends BaseClass {

	@Test
	public void newCustomerTest() {
		
		LoginPage lp=new LoginPage(driver);
		lp.set_Username(username);
		lp.set_Password(password);
		lp.clickOnLoginBtn();
		general.wait(3);
		NewCustomerpage customer = new HomePage().clickOnNewCustomer();
		customer.enterCustomerName("Anusha");
		customer.selectFemale();
		customer.enterDOB("06", "10", "1993");
		customer.enterAddr("india");
		customer.scrollToSubBtn();
		customer.enterCity("Davanagere");
		customer.enterPin("123456");
		customer.enterState("Karnataka");
		customer.entertele("1234567890");
		customer.enterEmail("anusha@gmail.com");
		customer.clickOnSubbtn();
		general.wait(3);

		
		
	}
	
}
