package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.HelpPageLocators;

public class HelpPage extends HelpPageLocators {

	public WebDriver driver;
	public HelpPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement AskQuestion() {
		return driver.findElement(askquestion);
	}
	
}