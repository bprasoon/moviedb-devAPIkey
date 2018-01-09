package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TVshowfullscreenPage {

	public WebDriver driver;
	
	By favorite=By.xpath("/*[@id='favourite']/span");
	By watchlist=By.xpath("/*[@id='watchlist']/span");
	
	//Constructor
	public TVshowfullscreenPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}

	public WebElement addtofavorite()
	{
	return driver.findElement(favorite);
	}
	public WebElement addtowatchlist()
	{
	return driver.findElement(watchlist);
	}

}
