package com.apikey;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobjects.Dashboardpage;
import com.pageobjects.Discoverpage;
import com.resources.Base;

public class DiscoverlinkTest extends Base {
	
	public Dashboardpage dbp;	
	public Discoverpage dp;	
	@BeforeTest
	
	public void browserload() throws IOException 
	{
		
		driver=Driverintialize();
		driver.get(propfile.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
//TO DO: Method for selecting the Discover link from the top navigation and then selecting a movie from the list
	@Test
	public void discoverlink() throws IOException
	
	{
		DashboardTest sii= new DashboardTest();
		sii.signin();
		dbp = new Dashboardpage(driver);
		dbp.Discoverlink().click();
		dp =new Discoverpage(driver);
		dp.headertext().getText();
		WebElement movscr=driver.findElement(By.xpath("//*[@id='main']/div/section/div"));
		movscr.findElements(By.linkText("More Info")).get(0).click();
		
	}
	
//TO DO: To sign out from the application	
	@Test
	public void signout()
	{
		dbp.unameicon().click();
		dbp.logout().click();
	}	
	
	@AfterTest
	public void browserclose() throws IOException 
	{
		driver.close();
		driver=null;
		
	}
}
