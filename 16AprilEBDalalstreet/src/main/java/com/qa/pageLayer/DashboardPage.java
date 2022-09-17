package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class DashboardPage extends TestBase {
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//search box
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement search_box;
	
	public void enterCompanyName(String company_name)
	{
		search_box.sendKeys(company_name);
	}

	@FindBy(linkText = "WIPRO")
	private WebElement wipro_options;
	
	public void clickOnCompanyNameWipro()
	{
		wipro_options.click();
	}
	
	@FindBy(partialLinkText = "AXIS")
	private WebElement axis_options;
	
	public void clickOnCompanyNameAxis()
	{
		axis_options.click();
	}
	
}
