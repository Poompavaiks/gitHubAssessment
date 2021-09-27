package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.LoginPageLocators;

public class LoginPage extends LoginPageLocators {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
    
	
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	
	
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	
	
	public WebElement Submit()
	{
		return driver.findElement(submit);
	}
	
	
	

}
