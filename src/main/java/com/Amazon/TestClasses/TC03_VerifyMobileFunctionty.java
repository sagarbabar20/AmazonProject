package com.Amazon.TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Amazon.POMClasses.HomePOMClass;
import com.Amazon.POMClasses.POMClassMobilePage;
import com.Amazon.POMClasses.POM_LoginClass;
import com.SauceDemo.utilityClass.ScreenshotClass;

public class TC03_VerifyMobileFunctionty extends TestBaseClass
{
	@Test
	public void VerifyMobileFunctionty() throws IOException
	{
		
		HomePOMClass hp=new HomePOMClass(driver);
		hp.sendkeySearchTextBox();
		log.info("mobile name is entered");

		hp.ClickSearchTextBoxButton();
		log.info("clicked on search button");

		POMClassMobilePage mp=new POMClassMobilePage(driver);
		mp.clickSamsungmobile();
		log.info("clicked on samsung mobile");
		ScreenshotClass.takeScreenshot(driver);

	
		
		
		
		
	}

}
