package com.Amazon.TestClasses;

import java.io.IOException;
import java.util.ArrayList
;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Amazon.POMClasses.HomePOMClass;
import com.Amazon.POMClasses.POMClassMobilePage;
import com.Amazon.POMClasses.POM_LoginClass;
import com.Amazon.POMClasses.SwitchWindowPOMClass;
import com.SauceDemo.utilityClass.ScreenshotClass;

public class TC04_VerifySwitchToWindowFunctionality extends TestBaseClass
{
	@Test
	public void VerifySwitchToWindowFunctionality() throws IOException
	{
	
	
	HomePOMClass hp=new HomePOMClass(driver);
	hp.sendkeySearchTextBox();
	System.out.println("mobile name is entered");

	hp.ClickSearchTextBoxButton();
	log.info("clicked on search button");

	POMClassMobilePage mp=new POMClassMobilePage(driver);
	mp.clickSamsungmobile();
	log.info("clicked on samsung mobile ");

	List<String> allpagesAddress=new ArrayList<String>(driver.getWindowHandles());
		
	driver.switchTo().window(allpagesAddress.get(1));
	
	SwitchWindowPOMClass sw=new SwitchWindowPOMClass(driver);
	
	sw.ClickonAddtoCart();
	log.info("clicked on add to cart ");
	ScreenshotClass.takeScreenshot(driver);

	
//	String expectedtext="1";
//	String actualtext=driver.get	
//			
//	
//	Assert.assertEquals(actualtext, expectedtext);

	
	
	
	
	}
}
