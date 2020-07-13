package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.genericlib.BaseClass;
import com.inetbanking.utilities.general;

public class NewCustomerpage extends BaseClass{

	WebDriver ldriver;
	
	public NewCustomerpage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public NewCustomerpage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//input[@name='name']")
	WebElement customername;
	
	@FindBy(xpath="//tr[5]//td[2]//input[2]")
	WebElement female;
	
	@FindBy(xpath="//tr[5]//td[2]//input[1]")
	WebElement male;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement dob;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement addr;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement citye;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement statee;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pin;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement teleph;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement subbtn;
	
	public void enterCustomerName(String name) {
		customername.sendKeys(name);
	}
	
	public void selectFemale() {
		female.click();
	}
	public void selectMale() {
		male.click();
	}
	public void enterDOB(String mm,String dd,String yyyy) {
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yyyy);

	}
	
	public void enterAddr(String address) {
		addr.sendKeys(address);
	}
	
	public void enterCity(String city) {
		citye.sendKeys(city);
	}
	
	public void enterState(String state) {
		statee.sendKeys(state);
	}
	
	public void enterPin(String pinno) {
		pin.sendKeys(pinno);
	}
	
	public void entertele(String telephone) {
		teleph.sendKeys(telephone);
	}
	
	public void enterEmail(String emailid) {
		email.sendKeys(emailid);
	}
	
	public void clickOnSubbtn() {
		subbtn.click();
	}
	
	public void scrollToSubBtn() {
		general.scrollToPerticularElement(subbtn);
	}
}
