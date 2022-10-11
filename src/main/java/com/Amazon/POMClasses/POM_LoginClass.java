package com.Amazon.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LoginClass 
{
	private WebDriver driver;
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement HelloLogin;
	
	public void clickHelloLogin()
	{
		HelloLogin.click();
	}
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement username;
	
	public void sendusername()
	{
		username.sendKeys("7776067870");
	}
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement ContinueButton;
	
	public void ClickContinueButton()
	{
		ContinueButton.click();
	}

	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement password;
	
	public void sendpassword()
	{
		password.sendKeys("Sagar@205");
	}
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement SigninButton;
	
	public void ClickSigninButton()
	{
		SigninButton.click();
	}
	
	public POM_LoginClass(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}


}
