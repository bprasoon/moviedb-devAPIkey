package com.apikey;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.resources.Base;

public class DummynotificationsalertTest extends Base {
	
	@BeforeTest
	
	public void browserload() throws IOException 
	{
		driver=Driverintialize();
		driver.get(propfile.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	
//TO DO: Method to check if there is a notification alert in the header	
	@Test
	public void notficaalert() throws IOException
	
	{
		//click on the notification alert icon on the top right corner
		//validate if there is any notifications.
		// if notification present then navigate to the notifications.
		//navigate to the dashboard
		//log out.
		
		
				
	}
	@AfterTest
	public void browserclose() throws IOException 
	{
		driver.close();
		driver=null;
		
	}
}
