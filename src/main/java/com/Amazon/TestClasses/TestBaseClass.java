package com.Amazon.TestClasses;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.Amazon.POMClasses.POM_LoginClass;

public class TestBaseClass 
{
   public WebDriver driver;
   Logger log = Logger.getLogger("AmazonProject2");
   @Parameters("browserName")
   @BeforeMethod
	public void SetUpMethod(String browserName)
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		}
		else
		{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\geckodriver.exe");
	    driver=new FirefoxDriver();

		}
		PropertyConfigurator.configure("log4j.properties");
		
		 log.info("browser is opend");
		 driver.manage().window().maximize();
		 log.info("browser is maximized");
		 driver.get("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
		 log.info("url is opened");

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		 POM_LoginClass login= new POM_LoginClass(driver);
		 login.clickHelloLogin();
		 log.info("Clicked on hello login tab");
		 
		 login.sendusername();
		 log.info("user name is entered");

		 login.ClickContinueButton();
		 log.info("Clicked on continue button");

		 login.sendpassword();
		 log.info("Clicked on heelo login tab");

		 login.ClickSigninButton();
		 log.info("Clicked on signin button");

	}
		 @AfterMethod 
		 public void tearDownMethod()
		 {
			 driver.close();
			 log.info("browser is closed");
		 }
	
	

}
