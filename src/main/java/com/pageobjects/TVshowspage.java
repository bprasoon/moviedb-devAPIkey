package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TVshowspage {

	public WebDriver driver;
	
	By popushowlist=By.xpath("//*[@id='main']/div/div[3]");
	
	
	//Constructor
	public TVshowspage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}

	public WebElement Propershowlist()
	{
	return driver.findElement(popushowlist);
	}
	

}
