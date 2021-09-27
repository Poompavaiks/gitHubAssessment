package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.GiftPageLocators;

public class GiftPage extends GiftPageLocators {
	public WebDriver driver;
	public GiftPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
    public WebElement HouseWarming() {
		return driver.findElement(housewarming);
	}
    
    public WebElement EnterAmount() {
		return driver.findElement(EnterAmount);
	}
    public WebElement Month() {
		return driver.findElement(Month);
	}
    public WebElement Date() {
		return driver.findElement(Date);
	}
    public WebElement Next() {
		return driver.findElement(Next);
	}
    public WebElement RecipientName() {
		return driver.findElement(RecipientName);
	}
    public WebElement RecipientEmail() {
		return driver.findElement(RecipientEmail);
	}
    public WebElement YourName() {
		return driver.findElement(yourName);
	}
    public WebElement YourEmail() {
		return driver.findElement(yourEmail);
	}
    public WebElement YourMobile() {
		return driver.findElement(yourMobile);
	}
    public WebElement Message() {
		return driver.findElement(message);
	}
    public WebElement Confirm() {
		return driver.findElement(confirm);
	}
    public WebElement ProceedToPay() {
		return driver.findElement(proceedToPay);
	}
    public WebElement Frame()
    {
    	return driver.findElement(frame);
    }
}