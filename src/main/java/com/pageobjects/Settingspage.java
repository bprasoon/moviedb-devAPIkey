package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Settingspage {

	public WebDriver driver;
	

	By details=By.linkText("Details");
	By api=By.xpath("//*[@id='main']/div[2]/div/div/div/div/ul/li[9]/a");
	By keytext=By.xpath("//*[@id='main']/div[2]/div/div/div/section/div/h3[4]");
	By key = By.xpath("//*[@id='main']/div[2]/div/div/div/section/div/pre[1]");
	By keyurl = By.xpath("//*[@id='main']/div[2]/div/div/div/section/div/pre[3]");

	By Notsetlink= By.xpath("//*[@id='main']/div[2]/div/div/div/div/ul/li[3]/a");
	By Notsel1= By.xpath("//*[@id='main']/div[2]/div/div/div/section/div/form/div[1]/input");
	By Notsel2= By.xpath("//*[@id='main']/div[2]/div/div/div/section/div/form/div[2]/input");
	By Notsel3= By.xpath("//*[@id='main']/div[2]/div/div/div/section/div/form/div[3]/input");
	By savbut= By.xpath("//*[@id='main']/div[2]/div/div/div/section/div/form/input");
	By nottext= By.xpath("//*[@id='main']/div[2]/div/div/div/section/div/h2");
	//Constructor
	public Settingspage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}


	public WebElement APIlink()
	{
	return driver.findElement(api);
	}

	public WebElement Detailslink()
	{
	return driver.findElement(details);
	}

	public WebElement APIkeytitle()
	{
	return driver.findElement(keytext);
	}
	public WebElement APIkeytext()
	{
	return driver.findElement(key);
	}
	public WebElement APIkeyurl()
	{
	return driver.findElement(keyurl);
	}
	public WebElement Notsettinglink()
	{
	return driver.findElement(Notsetlink);
	}
	public WebElement Notselection1()
	{
	return driver.findElement(Notsel1);
	}
	public WebElement Notselection2()
	{
	return driver.findElement(Notsel2);
	}
	public WebElement Notselection3()
	{
	return driver.findElement(Notsel3);
	}
	public WebElement savebuton()
	{
	return driver.findElement(savbut);
	}
	public WebElement notificatext()
	{
	return driver.findElement(nottext);
	}
}
