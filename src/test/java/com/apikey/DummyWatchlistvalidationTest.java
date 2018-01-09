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

public class DummyWatchlistvalidationTest extends Base {
	
	public Dashboardpage dbp;	
	public TVshowfullscreenPage tvs;
	@BeforeTest
	
	public void browserload() throws IOException 
	{
		
		driver=Driverintialize();
		driver.get(propfile.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
//TO DO: Method for selecting and adding to watchlist and check if the same details displayed on both the watchlist options: dashboard and username icon(top right corner)
	@Test
	public void watchlistvalidation() throws IOException
	
	{
		DashboardTest sii= new DashboardTest();
		sii.signin();
		dbp = new Dashboardpage(driver);
		dbp.TVshowslink().click();
		WebElement tvshoscr=driver.findElement(By.xpath("//*[@id='main']/div/div[3]"));
		tvshoscr.findElements(By.linkText("More Info")).get(2).click();
		
		//select the add to watchlist option
		//Navigate to the WatchList tab in the dashboard(profile) and check if the above added tv show is listed in the watchlist
		//Navigate to the username icon on the top night corner and in the list box navigate to the watchlist
		//Validate if the list of tv show displayed in watchlist from the profile and the username listbox are the same
		//remove the above selected movie from the watchlist and validate it from username listbox watchlist option
		//verify if the above tv show is removed from the watchlists and it matches on both the place
		//log out
	}
	
	@AfterTest
	public void browserclose() throws IOException 
	{
		driver.close();
		driver=null;
		
	}
}
