package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Peoplepage {

	public WebDriver driver;
	
	By login=By.cssSelector("a[href*='login']");
	
	
	//Constructor
	public Peoplepage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}

	public WebElement getlogin()
	{
	return driver.findElement(login);
	}
	

}
