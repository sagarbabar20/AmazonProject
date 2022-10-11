package com.Amazon.POMClasses;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMClass 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement SearchTextBox;
	
	public void sendkeySearchTextBox()
	{
		SearchTextBox.sendKeys("mobile");
	}
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement SearchTextBoxButton;
	
	public void ClickSearchTextBoxButton()
	{
		SearchTextBoxButton.click();
	}
	
	public HomePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

}
