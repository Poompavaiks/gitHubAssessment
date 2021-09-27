package com.mindtree.UIStore;

import org.openqa.selenium.By;

public class LandingPageLocators {
	
	
	
    protected By store=By.xpath("//*[@id=\"header\"]/section/div/ul[2]/li[1]/a");
	
	
    protected By popup=By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]");
	
	
    protected By sale=By.xpath("//*[@class='container']/header/div[2]/div/nav/div/ul/li[1]");
	
	
    protected By table = By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[1]/div/div/ul/li[1]/ul/li[4]/a/span");
	
	
	
    protected By living=By.cssSelector(".topnav_item.livingunit");
	
	
    protected By loveSeats=By.linkText("Loveseats");
	
	
    protected By kidsRoom=By.cssSelector(".topnav_item.kidsroomunit");
	
	
    protected By wardrobe=By.linkText("Kids Wardrobes");
	
    protected By decor=By.xpath("//*[@id=\"content\"]/div[3]/div/div[3]/a[6]");
	
    protected By giftcard=By.xpath("//a[@href='../../gift-cards?src=header']");
	
    protected By help=By.xpath("//a[@class='inherit contact-channel']");
	
    protected By hover=By.xpath("//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[2]/span");
	
	
    protected By login=By.linkText("Log In");
	
	
    protected By logout=By.linkText("Logout");
	
    protected By dining=By.cssSelector(".topnav_item.diningunit");
	
    protected By diningTable=By.xpath("//*[@id=\"topnav_wrapper\"]/ul/li[4]/div/div/ul/li[1]/ul/li[1]/a");
    
	

}
