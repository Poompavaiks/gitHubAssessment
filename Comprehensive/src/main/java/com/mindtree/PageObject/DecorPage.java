package com.mindtree.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.DecorPageLocators;

public class DecorPage extends DecorPageLocators {
	WebDriver driver;
	public DecorPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public List<WebElement> DecorName()
	{
		return  driver.findElements(DecorName);
	}
	

}
