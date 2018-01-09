package com.apikey;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.resources.Base;

public class DummysearchTest extends Base {
	
	@BeforeTest
	
	public void browserload() throws IOException 
	{
		driver=Driverintialize();
		driver.get(propfile.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	
//TO DO: Method to search a movie or tv show and add the results to the watchlist
	@Test
	public void searchandadd() throws IOException
	
	{
		//enter a movie name in the search box
		//confirm if the result shows up
		//enter a tv show in the search box
		//confirm if the result shows up
		//add the tv show and the movie displayed in the search results to the watchlist
		//navigate to dashboard
		//log out.
		
		
				
	}
	@AfterTest
	public void browserclose() throws IOException 
	{
		driver.close();
		driver=null;
		
	}
}
