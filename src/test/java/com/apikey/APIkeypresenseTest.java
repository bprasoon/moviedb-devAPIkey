package com.apikey;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageobjects.Dashboardpage;
import com.pageobjects.Homepage;
import com.pageobjects.Settingspage;
import com.pageobjects.Signinpage;
import com.resources.Base;

public class APIkeypresenseTest extends Base {
	
	public Dashboardpage dbp;
	public Settingspage sett;
	public String devkey;
	public String devkeyurl;
	
	@BeforeTest
		
	public void browseropen() throws IOException 
	{
		driver=Driverintialize();
				
	}
	
// TO DO: parameterizing the username and password so that multiple values can be run and checked for API key
	@Test (dataProvider="getuserdata")
	public void Keypresent(String username, String password) throws IOException
	
	{
		driver.get(propfile.getProperty("url"));
		driver.manage().window().maximize();
		Homepage lp= new Homepage(driver);
		lp.getlogin().click();
		Signinpage si = new Signinpage(driver);
		si.getusername().sendKeys(username);
		si.getpassword().sendKeys(password);
		si.loginbutton().click();
		dbp = new Dashboardpage(driver);
		dbp.unameicon().click();
		dbp.Settings().click();
		sett = new Settingspage(driver);
		sett.APIlink().click();
		sett.Detailslink().click();
		Assert.assertEquals(sett.APIkeytitle().getText(), "API Key (v3 auth)");
		devkey=sett.APIkeytext().getText();
		devkeyurl=sett.APIkeyurl().getText();
		Assert.assertTrue(true, devkey);
		System.out.println("API Key is present");
		System.out.println("key value: "+ devkey);
		System.out.println("Dev API url: "+ devkeyurl);
		dbp.unameicon().click();
		dbp.logout().click();
				
	}
	@AfterTest
	public void browserclose() throws IOException 
	{
		
		driver.close();
		driver=null;
		
	}
	
//TO DO: The values for the username and password is passed from here	
	@DataProvider
	public Object[][] getuserdata() throws IOException 
	{
		Object[][] userdata =new Object[2][2];
		userdata[0][0]= "firsttest";
		userdata[0][1]= "1234";
		
		userdata[1][0]= "sectest";
		userdata[1][1]= "4321";
		
		return userdata;
	}
	

}
