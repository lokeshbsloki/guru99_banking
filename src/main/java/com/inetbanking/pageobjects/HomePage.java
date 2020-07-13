package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.genericlib.BaseClass;

public class HomePage extends BaseClass {

	WebDriver ldriver;
	
	public HomePage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement logout;
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement newcustomer;
	
	public void clickOnLogoutBtn() {
		logout.click();
	}
	
	public NewCustomerpage clickOnNewCustomer() {
		newcustomer.click();
		return new NewCustomerpage();
	}
}
