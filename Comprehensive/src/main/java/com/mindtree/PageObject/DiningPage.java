package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.DiningPageLocators;

public class DiningPage extends DiningPageLocators {
	WebDriver driver;
	public DiningPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement ResultCount()
	{
		return driver.findElement(resultCount);
	}

}
