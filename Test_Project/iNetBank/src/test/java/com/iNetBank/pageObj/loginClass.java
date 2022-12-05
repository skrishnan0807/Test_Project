package com.iNetBank.pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginClass {

	WebDriver ldriver;
	
	public loginClass(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement loginButton;
	
	public void setUsername(String uname) {
		username.sendKeys(uname);
	}
	public void setPassword(String pword) {
		password.sendKeys(pword);
	}
	public void clickButton() {
		loginButton.click();
	}
	
	

}
