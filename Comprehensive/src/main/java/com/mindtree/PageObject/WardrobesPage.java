package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.UIStore.WardrobesPageLocators;

public class WardrobesPage extends WardrobesPageLocators{
	WebDriver driver;
	public WardrobesPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement Dropdown()
	{
		return driver.findElement(sortDropdown);
	}
	
	public WebElement NewArrivals()
	{
		return driver.findElement(Newarrivals);
	}
	
	public WebElement value()
	{
		return driver.findElement(option);
	}

}
