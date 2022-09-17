package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.pageLayer.Loginpage;
import com.qa.testBase.TestBase;

public class LoginpageTest extends TestBase {
	
	@Test
	public void verifyLoginTest()
	{
		Loginpage login = new Loginpage();
		login.enterEmailAddress();
		login.enterPassword();
		login.clickOnLoginButton();
		System.out.println("Login Test updated");
		System.out.println("Login Test updated second time");
		System.out.println("Login Test updated Third time");
		
		
	}
}
