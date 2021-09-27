package com.mindtree.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.TablesLocators;

public class Tables extends TablesLocators {
	WebDriver driver;
	public Tables(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public List<WebElement> List()
	{
		return driver.findElements(list);
	}

}
