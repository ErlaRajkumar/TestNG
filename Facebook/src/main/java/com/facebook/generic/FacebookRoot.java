package com.facebook.generic;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class FacebookRoot implements CommonSetUp
{
	public static WebDriver driver;
	public static int pass,fail;
	@BeforeSuite
	public void productInfo()
	{
		Reporter.log("Sending A Message Using through Facebook Messenger",true);
	}
	
	@BeforeTest
	public void setPro()
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	
	@BeforeMethod
	public void openApp() throws IOException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(ITO, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(FB_URL);
		Assert.assertEquals(FB_URL, driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		Reporter.log("The URl is: "+url,true);
		Reporter.log("Title is: "+ driver.getTitle(),true);
	}
	
	@AfterMethod
	public void closeApp(ITestResult it)
	{
		if(it.getStatus()==2)
		{
			fail++;
			 String name = it.getName();
		     Facebook_DataReading.FB_TakeScreenShot(driver,PHOTO_PATH+name+".png" );
		}else
		{
			pass++;
		}
		
		driver.quit();
	}
	
	@AfterSuite
	public void excelReport()
	{
		Reporter.log("Successfull",true);
	}

}
