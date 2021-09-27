package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.LandingPageLocators;

public class LandingPage extends LandingPageLocators {
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
    
	
	public WebElement Store()
	{
		return driver.findElement(store);
	}
	
	public int getPopupsize()
	{
		return driver.findElements(popup).size();
	}
	public WebElement getPopup() 
	{
		return driver.findElement(popup);
	}
	
	
	public WebElement Sale()
	{
		return driver.findElement(sale);
	}
	
	
	
	public WebElement table()
	{
		return driver.findElement(table);
	}
	
	
	public WebElement Living()
	{
		return driver.findElement(living);
	}
	
	
	public WebElement LoveSeats()
	{
		return driver.findElement(loveSeats);
	}
	
	
	public WebElement KidsRoom()
	{
		return driver.findElement(kidsRoom);
	}
	
	
	public WebElement Wardrobes()
	{
		return driver.findElement(wardrobe);
	}
	
	public WebElement Decor()
	{
		return driver.findElement(decor);
	}
	
	public WebElement getGiftcard() 
	{
		return driver.findElement(giftcard);
	}
	
	public WebElement getHelp() {
		return driver.findElement(help);
	}

	
	public WebElement Hover()
	{
		return driver.findElement(hover);
	}
	
	
	
	public WebElement Login()
	{
		return driver.findElement(login);
	}
	
	public WebElement Logout()
	{
		return driver.findElement(logout);
	}
	
	public WebElement Dining()
	{
		return driver.findElement(dining);
	}
    
    public WebElement DiningTable()
    {
    	return driver.findElement(diningTable);
    }
	

}
