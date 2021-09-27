package com.mindtree.UIStore;

import org.openqa.selenium.By;

public class LoveSeatsPageLocators {
	
	protected By filter=By.className("item");
	protected By radio=By.id("price_limit_22893-28827");
	protected By seat=By.xpath("//*[@id=\"content\"]/div[4]/ul/li[2]/div");
	protected By viewProduct=By.xpath("//*[@id=\"content\"]/div[4]/ul/li[2]/div/div[3]/div[2]/a[2]");
	protected By cost=By.cssSelector(".price.discounted-price");
	protected By resultCount=By.className("results-count");
	
}
