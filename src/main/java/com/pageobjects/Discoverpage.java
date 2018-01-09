package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Discoverpage {

	public WebDriver driver;
	
	By htext=By.xpath("//*[@id='main']/div/section/h2");
	By tvshow=By.xpath("//*[@id='main']/div/section/h2/span/a[2]");
	
		//Constructor
	public Discoverpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}

	public WebElement headertext()
	{
	return driver.findElement(htext);
	}
	public WebElement tvshowlink()
	{
	return driver.findElement(tvshow);
	}

}
