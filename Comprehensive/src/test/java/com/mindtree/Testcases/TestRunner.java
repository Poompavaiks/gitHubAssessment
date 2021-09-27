package com.mindtree.Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.mindtree.PageObject.DecorPage;
import com.mindtree.PageObject.DiningPage;
import com.mindtree.PageObject.GiftPage;
import com.mindtree.PageObject.HelpPage;
import com.mindtree.PageObject.LandingPage;
import com.mindtree.PageObject.LoginPage;
import com.mindtree.PageObject.LoveSeatsPage;
import com.mindtree.PageObject.StoresPage;
import com.mindtree.PageObject.Tables;
import com.mindtree.PageObject.WardrobesPage;
import com.mindtree.ReusableComponents.BrowserSelection;
import com.mindtree.utilities.DataDriven;

public class TestRunner extends BrowserSelection{
	LandingPage l;
	DataDriven data;
	Actions action;
	 
	int row;
	int column;
	public static Logger log=LogManager.getLogger(TestRunner.class);
	@BeforeTest
	public void BrowserNavigation() throws IOException
	{
		
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		log.info("Driver is navigated to Web page");
		l=new LandingPage(driver);
		if(l.getPopupsize()>0)
		{
			l.getPopup().click();
		}
		
	}
	@Test(priority=1)
	public void Login() throws IOException
	{
		String filepath=prop.getProperty("filepath");
		String sheetName=prop.getProperty("sheetName");
		row=Integer.parseInt(prop.getProperty("loginrow"));
		column=Integer.parseInt(prop.getProperty("logincolumn"));
		LoginPage login=new LoginPage(driver);
		l=new LandingPage(driver);
		data=new DataDriven();
		action=new Actions(driver);
		action.moveToElement(l.Hover()).perform();
		l.Login().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String[] value=data.getData(filepath, sheetName, row, column);
		int i=0;
		login.Email().sendKeys(value[i]);
		login.Password().sendKeys(value[i+1]);
		login.Submit().click();
		log.info("Logged in");
		
	}
	
	@Test(priority=2)
	public void Stores()
	{
		l=new LandingPage(driver);
		StoresPage s=new StoresPage(driver);
		l.Store().click();
		s.Button().click();
		System.out.println("Address:"+s.address().getText());
		log.info("The address of the store is obtained");
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority=3)
	public void Sale()
	{
		l=new LandingPage(driver);
		Tables t=new Tables(driver);
		action=new Actions(driver);
		action.moveToElement(l.Sale()).perform();
        l.table().click();
        int count=t.List().size();
        System.out.println("Count:"+count);
        log.info("The count is printed");
        driver.navigate().to(prop.getProperty("url"));
	}
	
	@Test(priority=4)
	public void FilterSearch()
	{
		l=new LandingPage(driver);
		LoveSeatsPage s=new LoveSeatsPage(driver);
		action=new Actions(driver);
		action.moveToElement(l.Living()).perform();
		l.LoveSeats().click();
		action.moveToElement(s.Filter()).perform();
		s.Radio().click();
		action.moveToElement(s.Seat()).perform();
		s.ViewProduct().click();
		String price=s.Cost().getText();
		System.out.println("The price of seat:"+price);
		log.info("The size of the seat is specified");
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority=5)
	public void SortBy()
	{
		l=new LandingPage(driver);
		WardrobesPage w=new WardrobesPage(driver);
		action=new Actions(driver);
		action.moveToElement(l.KidsRoom()).perform();
		l.Wardrobes().click();
		action.moveToElement(w.Dropdown()).perform();
		w.NewArrivals().click();
		System.out.println("Name:"+ w.value().getText());
		log.info("The name of wardrobe is printed");
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority=6)
	public void DecorList()
	{
		l=new LandingPage(driver);
		DecorPage d=new DecorPage(driver);
		l.Decor().click();
		Assert.assertEquals(13, d.DecorName().size());
		log.info("Value is validated");
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority=7)
	public void ResultsCount() throws InterruptedException {
		l=new LandingPage(driver);
		action= new Actions(driver);
		action.moveToElement(l.Dining()).build().perform();
		l.DiningTable().click();
		DiningPage dine=new DiningPage(driver);
		System.out.println("The results count :"+dine.ResultCount().getText());
		log.info("The results count is printed");
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority=9)
	public void GiftCoupon() throws IOException {
		
		l=new LandingPage(driver);
		GiftPage g=new GiftPage(driver);
		data =new DataDriven();
		String filepath=prop.getProperty("filepath");
		String sheetName=prop.getProperty("sheetName");
		row=Integer.parseInt(prop.getProperty("giftcouponrow"));
		column=Integer.parseInt(prop.getProperty("giftcouponcolumn"));
		String[] value=data.getData(filepath, sheetName, row, column);
		int i=0;
		l.getGiftcard().click();
		g.HouseWarming().click();
		g.EnterAmount().sendKeys(value[i]);
		g.Month().sendKeys(Keys.ENTER);
		g.Date().sendKeys(value[i+1]);
		g.Date().sendKeys(Keys.ENTER);
		g.Next().click();
		g.RecipientName().sendKeys(value[i+2]);
		g.RecipientEmail().sendKeys(value[i+3]);
		g.YourName().sendKeys(value[i+4]);
		g.YourEmail().sendKeys(value[i+5]);
		g.YourMobile().sendKeys(value[i+6]);
		g.Confirm().click();
		Assert.assertFalse(g.Frame().isDisplayed());
		log.error("The validation failed");
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority=8)
	public void Help() throws InterruptedException, IOException {
		l = new LandingPage(driver);
		HelpPage h = new HelpPage(driver);
		data=new DataDriven();
		String filepath=prop.getProperty("filepath");
		 String sheetName=prop.getProperty("sheetName");
		row=Integer.parseInt(prop.getProperty("helprow"));
		column=Integer.parseInt(prop.getProperty("helpcolumn"));
		l.getHelp().click();
		int i=0;
		String[] value=data.getData(filepath, sheetName, row, column);
		h.AskQuestion().sendKeys(value[i]);
		h.AskQuestion().sendKeys(Keys.ARROW_DOWN);
		h.AskQuestion().sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Current URL:"+driver.getCurrentUrl());
		driver.navigate().to(prop.getProperty("url"));

	}
	
	@AfterTest
	public void CloseBrowser()
	{
		driver.close();
		log.info("Driver is closed");
	}

}
