package com.iNetBank.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class baseClass {
	
	public String baseURL = "https://practicetestautomation.com/practice-test-login/";
	public String username = "student";
	public String password = "Password123";
	public static WebDriver driver;
	
	public static Logger logger;
	
	
	@BeforeClass
	public void starting() {
		System.setProperty("webdriver.chome.driver",
			System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();	
		
		logger = Logger.getLogger("E-Banking");
		PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	@AfterClass
	public void ending() {
		driver.quit();
	}

}
