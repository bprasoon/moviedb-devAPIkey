package com.apikey;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobjects.Dashboardpage;
import com.pageobjects.Homepage;
import com.pageobjects.Signinpage;
import com.resources.Base;

public class DashboardTest extends Base {
	
	
	@BeforeTest
	
	public void browserload() throws IOException 
	{
		driver=Driverintialize();
		driver.get(propfile.getProperty("url"));
		driver.manage().window().maximize();
		
	}
//TO DO: Method to Sign In to the application
	@Test
	public void signin() 
	
	{
		Homepage lp= new Homepage(driver);
		lp.getlogin().click();
		Signinpage si = new Signinpage(driver);
		si.getusername().sendKeys(propfile.getProperty("username"));
		si.getpassword().sendKeys(propfile.getProperty("password"));
		si.loginbutton().click();
	
	}	
//TO DO: Clicking on various option in dashboard and checking that through assertions
	@Test
	public void validation() 
	{
			Dashboardpage dp =new Dashboardpage(driver);
			dp.overviewlink().click();
			Assert.assertTrue(true);
			dp.watchlistlink().click();
			Assert.assertTrue(true);
			dp.listslink().click();
			Assert.assertTrue(true);
			dp.favlink().click();
			Assert.assertTrue(true);
			dp.recommendlink().click();
			Assert.assertTrue(true);
			dp.ratingslink().click();
			Assert.assertTrue(true);
			dp.discussionslink().click();
				
	}			
	
	@AfterTest
	public void browserclose() throws IOException 
	{
		driver.close();
		driver=null;
		
	}
}
