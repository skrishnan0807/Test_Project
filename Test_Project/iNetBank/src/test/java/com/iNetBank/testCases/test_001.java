package com.iNetBank.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetBank.pageObj.loginClass;


public class test_001 extends baseClass {
	
	
	@Test
	public void loginTest() {
		
		driver.get(baseURL);
		
		loginClass login = new loginClass(driver);
		
		login.setUsername(username);
		login.setPassword(password);
		login.clickButton();
		
		if(driver.getTitle().equals("Logged In Successfully | Practice Test Automation")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}

}
