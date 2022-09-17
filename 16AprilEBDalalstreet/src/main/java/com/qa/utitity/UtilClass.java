package com.qa.utitity;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.testBase.TestBase;

public class UtilClass extends TestBase{
	
	public static void takeSS(String name)
	{
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src =ts.getScreenshotAs(OutputType.FILE);
			String path = "C:\\Users\\232338\\eclipse-workspace\\16AprilEBDalalstreet\\screenshots\\";
			
			File des = new File(path+name+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			System.out.println("Please provide correct path");
		}
	}

}
