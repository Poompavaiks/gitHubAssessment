package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.mindtree.UIStore.LoveSeatsPageLocators;

public class LoveSeatsPage extends LoveSeatsPageLocators {
	WebDriver driver;
	public LoveSeatsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement Filter()
	{
		return driver.findElement(filter);
	}
	
	
	public WebElement Radio()
	{
		return driver.findElement(radio);
	}
	
	
	public WebElement Seat()
	{
		return driver.findElement(seat);
	}
	
	
	public WebElement ViewProduct()
	{
		return driver.findElement(viewProduct);
	}
	
	public WebElement Cost()
	{
		return driver.findElement(cost);
	}
	
	
	public WebElement ResultCount()
	{
		return driver.findElement(resultCount);
	}
}
