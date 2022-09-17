package com.qa.pageLayer;

import javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class ExchangeClass extends TestBase{
	
	public ExchangeClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	//buy button
	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement buy_btn1;
	
	public void clickOnBuyButton1()
	{
		buy_btn1.click();
	}
	
	//long term
	@FindBy(xpath="//label[text()='Long-term']")
	private WebElement long_term_btn;
	
	public void clickOnLongTermButton()
	{
		long_term_btn.click();
	}
	
	//long term
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement quantity_box;
	
	public void enterQuantity(int count)
	{
		quantity_box.click();
		quantity_box.sendKeys(String.valueOf(count));
	}
	
	//buy button
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_btn2;
	
	public void clickOnBuyButton2()
	{
		buy_btn2.click();
	}
	
	//get status
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement status;
	
	public String getStatus()
	{
		String xyz =status.getText();
		return xyz;
	}
	
	
	
	
	
	
}
