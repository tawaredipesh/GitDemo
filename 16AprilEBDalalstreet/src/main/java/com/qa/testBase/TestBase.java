package com.qa.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qa.pageLayer.DashboardPage;
import com.qa.pageLayer.ExchangeClass;
import com.qa.pageLayer.Loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Logger logger;
	public Loginpage login;
	public DashboardPage dash;
	public ExchangeClass exchange;
	
	@BeforeClass
	public void start()
	{
		 logger = Logger.getLogger("16 April EB Auto");
		 PropertyConfigurator.configure("log4j.properties");
		 logger.info("Automation Started");
	}
	
	@AfterClass
	public void end()
	{
		logger.info("Automation Stopped");
	}
	@BeforeMethod
	public void setUp()
	{
		String br = "Chrome";
		
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.info("Chrome launches");
		}
		else if (br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();	
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("This is not the correct browser name");
		}
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		logger.info("url launches, maximized browser, all cookies deleted");
		
		//login to website 
		login = new Loginpage();
		login.enterEmailAddress();
		login.enterPassword();
		login.clickOnLoginButton();
		
		//Object creation
		dash = new DashboardPage();
		exchange = new ExchangeClass();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		logger.info("browser closed");
	}

}
