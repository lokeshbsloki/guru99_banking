package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@name='uid']")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	@CacheLookup
	WebElement loginbtn;
	
	public void set_Username(String un) {
	
		username.sendKeys(un);
	}
	
	public void set_Password(String pwd) {
		
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginBtn() {
		loginbtn.click();
	}
	
	
}
