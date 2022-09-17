package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class Loginpage extends TestBase {
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//email textbox 
	@FindBy(xpath ="//input[@name='email']")
	private WebElement emailbox;
	
	public void enterEmailAddress()
	{
		emailbox.sendKeys("amarwaghmare573@gmail.com");
	}
	
	//password
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordbox;
	
	public void enterPassword()
	{
		passwordbox.sendKeys("Test@1234");
	}
	
	//login button
	@FindBy(xpath ="//button[@class='btn btn-dark btn-block']")
	private WebElement loginbtn;
	
	public void clickOnLoginButton()
	{
		loginbtn.click();
	}
}
