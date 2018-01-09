package com.apikey;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobjects.Dashboardpage;
import com.pageobjects.Settingspage;
import com.resources.Base;

public class NotificationssettingsTest extends Base {
	
	@BeforeTest
	
	public void browserload() throws IOException 
	{
		driver=Driverintialize();
		driver.get(propfile.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	
//TO DO: Method to go to the Notifications settings page and check/uncheck all the options. Logic is not added if the checkbox is already checked or not.	
	@Test
	public void Notificationssettings() throws IOException
	
	{
		DashboardTest dt= new DashboardTest();
		dt.signin();
		Dashboardpage dbp = new Dashboardpage(driver);
		dbp.unameicon().click();
		dbp.Settings().click();
		Settingspage si=new Settingspage(driver);
		si.Notsettinglink().click();
		System.out.println(si.notificatext().getText());
		si.Notselection1().click();
		si.Notselection2().click();
		si.Notselection3().click();
		si.savebuton().click();
		
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
