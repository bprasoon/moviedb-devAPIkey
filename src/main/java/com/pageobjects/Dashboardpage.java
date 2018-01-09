package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboardpage {

	public WebDriver driver;
	

	By nameicon=By.xpath("/html/body/div[1]/header/div[1]/div/div[2]/ul/li[4]/a/span");
	By prof =By.xpath("/html/body/div[11]/div/div[2]/div/div[1]/p/a");
	By overview=By.xpath("//*[@data-title='My Profile — The Movie Database (TMDb)']");
	By watchlist=By.xpath("//*[@data-title='My Watchlist — The Movie Database (TMDb)']");
	By lists=By.xpath("//*[@data-title='My Lists — The Movie Database (TMDb)']");
	By favorite =By.xpath("//*[@data-title='My Favorites — The Movie Database (TMDb)']");
	By recommendations=By.xpath("//*[@data-title='Recommendations — The Movie Database (TMDb)']");
	By ratings=By.xpath("//*[@data-title='My Ratings & Reviews — The Movie Database (TMDb)']");
	By discussions=By.xpath("//*[@data-title='My Discussions — The Movie Database (TMDb)']");
	By lout=By.linkText("Logout");
	By sett=By.linkText("Settings");
	By discoverli = By.xpath("/html/body/div[1]/header/div[1]/div/div[1]/ul/li[2]/a");
	By moviesli = By.xpath("/html/body/div[1]/header/div[1]/div/div[1]/ul/li[3]/a");
	By tvsholi = By.xpath("/html/body/div[1]/header/div[1]/div/div[1]/ul/li[4]/a");
	By people = By.xpath("/html/body/div[1]/header/div[1]/div/div[1]/ul/li[5]/a");
	
	//Constructor
	public Dashboardpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	}


	public WebElement unameicon()
	{
	return driver.findElement(nameicon);
	}
	public WebElement overviewlink()
	{
	return driver.findElement(overview);
	}
	public WebElement watchlistlink()
	{
	return driver.findElement(watchlist);
	}
	public WebElement listslink()
	{
	return driver.findElement(lists);
	}
	public WebElement favlink()
	{
	return driver.findElement(favorite);
	}
	public WebElement recommendlink()
	{
	return driver.findElement(recommendations);
	}
	public WebElement ratingslink()
	{
	return driver.findElement(ratings);
	}
	public WebElement discussionslink()
	{
	return driver.findElement(discussions);
	}
	public WebElement logout()
	{
	return driver.findElement(lout);
	}
	public WebElement Settings()
	{
	return driver.findElement(sett);
	}
	public WebElement Discoverlink()
	{
	return driver.findElement(discoverli);
	}
	public WebElement Movieslink()
	{
	return driver.findElement(moviesli);
	}
	public WebElement TVshowslink()
	{
	return driver.findElement(tvsholi);
	}
	public WebElement Peoplelink()
	{
	return driver.findElement(people);
	}
}
