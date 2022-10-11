
package com.Amazon.TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Amazon.POMClasses.POM_LoginClass;
import com.SauceDemo.utilityClass.ScreenshotClass;

public class TC01_VerifyLoginFunctionality extends TestBaseClass
{
	@Test
	public void VerifyLoginFunctionality() throws IOException
{
		ScreenshotClass.takeScreenshot(driver);
		
		log.info("Apply the validation");

        String expectedTitle="Amazon Sign In";
		
//		String actualTitle=driver.getTitle();
//		System.out.println(actualTitle);
//		
//		Assert.assertEquals(expectedTitle,actualTitle);	
}
}
