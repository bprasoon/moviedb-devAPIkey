package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signinpage {

	public WebDriver driver;
	

	By username=By.name("username");
	By password=By.name("password");
	By button=By.cssSelector("[value='Login']");
	
	
	//Constructor
	public Signinpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}


	public WebElement getusername()
	{
	return driver.findElement(username);
	}

	public WebElement getpassword()
	{
	return driver.findElement(password);
	}

	public WebElement loginbutton()
	{
	return driver.findElement(button);
	}

	

}
