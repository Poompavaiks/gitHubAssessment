package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.StoresPageLocators;

public class StoresPage extends StoresPageLocators {
	WebDriver driver;
	public StoresPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Button()
	{
		return driver.findElement(button);
	}
	
	public WebElement address()
	{
		return driver.findElement(address);
	}
	

}
