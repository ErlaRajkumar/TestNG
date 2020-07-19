package com.facebook.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Page {
	//SelectingAnAccountOption
			@FindBy(xpath = "(//img[@class='hu5pjgll lzf7d6o1']/ancestor::div[2])[1]")
			private WebElement accountOption;
			
			//SelectLogoutOption
			@FindBy(xpath = "//span[contains(text(),'Log Out')]\r\n" )
			private WebElement logout;
			
			public Account_Page(WebDriver driver) 
			{
				PageFactory.initElements(driver, this);
			}
			public void accountOption() 
			{
				accountOption.click();	
			}
			public void logout() 
			{
				logout.click();	 
			}
}
