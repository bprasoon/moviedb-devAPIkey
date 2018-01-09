package com.apikey;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.resources.Base;

public class DummyAccountsettingsvalidationTest extends Base {
	
	@BeforeTest
	
	public void browserload() throws IOException 
	{
		driver=Driverintialize();
		driver.get(propfile.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	
//TO DO: Method to change the account settings of the user account	
	@Test
	public void accountsettings() throws IOException
	
	{
		//Navigate the user to the settings
		//Navigate the user to the account settings
		//update the settings on the page
		//save the info
		//navigate to dashboard
		//come back to account settings and confirm if the change is still reflected.
		//log out.
		
		
				
	}
	@AfterTest
	public void browserclose() throws IOException 
	{
		driver.close();
		driver=null;
		
	}
}
