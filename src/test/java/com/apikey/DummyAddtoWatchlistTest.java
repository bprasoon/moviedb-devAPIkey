package com.apikey;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobjects.Dashboardpage;
import com.pageobjects.TVshowfullscreenPage;
import com.resources.Base;

public class DummyAddtoWatchlistTest extends Base {
	
	public Dashboardpage dbp;	
	public TVshowfullscreenPage tvs;
	@BeforeTest
	
	public void browserload() throws IOException 
	{
		
		driver=Driverintialize();
		driver.get(propfile.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
//TO DO: Method for validating if we are able to add to the watchlist 
	@Test
	public void addtowatchlist() throws IOException
	
	{
		DashboardTest sii= new DashboardTest();
		sii.signin();
		dbp = new Dashboardpage(driver);
		dbp.TVshowslink().click();
		WebElement tvshoscr=driver.findElement(By.xpath("//*[@id='main']/div/div[3]"));
		tvshoscr.findElements(By.linkText("More Info")).get(2).click();
				
		//select the add to watchlist option
		//Navigate to the WatchList tab in the dashboard(profile) and check if the above added tv show is listed in the watchlist
		
	}	
//TO DO: method to remove the above selected movie from the watchlist
		@Test
		public void removefromwatchlist() throws IOException
		
		{
		//remove the above selected movie from the watchlist
		//verify if the above tv show is removed from the watchlist
		//logout
		
		}
		
	@AfterTest
	public void browserclose() throws IOException 
	{
		driver.close();
		driver=null;
		
	}
}
