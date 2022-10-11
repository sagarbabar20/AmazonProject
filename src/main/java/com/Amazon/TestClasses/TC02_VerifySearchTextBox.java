package com.Amazon.TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Amazon.POMClasses.HomePOMClass;
import com.Amazon.POMClasses.POM_LoginClass;
import com.SauceDemo.utilityClass.ScreenshotClass;

public class TC02_VerifySearchTextBox extends TestBaseClass
{
	@Test
	public void VerifySearchTextBox() throws InterruptedException, IOException
	{
				
		HomePOMClass hp=new HomePOMClass(driver);
		hp.sendkeySearchTextBox();
		log.info("mobile is entered in search box");
		ScreenshotClass.takeScreenshot(driver);

		log.info("mobile name is entered");

		hp.ClickSearchTextBoxButton();
		ScreenshotClass.takeScreenshot(driver);

		log.info("clicked on search button");

		
	}

}
