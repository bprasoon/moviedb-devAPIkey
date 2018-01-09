package com.apikey;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobjects.Dashboardpage;
import com.pageobjects.TVshowfullscreenPage;
import com.resources.Base;

public class DummyfootervalidationTest extends Base {
	
	public Dashboardpage dbp;	
	public TVshowfullscreenPage tvs;
	@BeforeTest
	
	public void browserload() throws IOException 
	{
		
		driver=Driverintialize();
		driver.get(propfile.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
//TO DO: Method for going through each link and validate if they are going to the correct link and the page has the correct content
	
	@Test
	public void footervalidation() throws IOException
	
	{
		//Go to each link in footer and confirm if all of the links are navigated to the correct page.
		//validate if the contents are correct on the destination page
		//come back to the dashboard
		
		//Logout
		
	}
	
	@AfterTest
	public void browserclose() throws IOException 
	{
		driver.close();
		driver=null;
		
	}
}
