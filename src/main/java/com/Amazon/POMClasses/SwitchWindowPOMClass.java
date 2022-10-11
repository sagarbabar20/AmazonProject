package com.Amazon.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwitchWindowPOMClass
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement Addtocart;
	
	public void ClickonAddtoCart()
	{
		Addtocart.click();
	}
	
	
	public SwitchWindowPOMClass(WebDriver driver)
	{
		this.driver=driver;
		
	  PageFactory.initElements(driver,this);
	}

}
