package com.resources;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {
	
	public static WebDriver driver;
	public static Properties propfile;
	public WebDriver Driverintialize() throws IOException
	{
		String browsername;
		
// TODO: Defining the property file so that variables can be provided	
		
		propfile = new Properties();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("details.properties");
		propfile.load(inputStream);
		browsername= propfile.getProperty("browsername");
			
// TODO: Declaring chrome driver for invoking Chrome browser
		
		if (browsername.equalsIgnoreCase("chrome"))
				{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
	
				}
	
/*As done for Chrome browser, we can also do it for other browsers.
	
	example for firefox browser 
	
		if (browsername.equalsIgnoreCase("firefox"))
		{
	System.setProperty("webdriver.firefox.driver", ".......");
	driver = new Firefoxdriver();
	
*/
		
		
// TODO: Defining a common browser timeout for the test case to fail
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	
// TODO:  Method for capturing screenshot for failed test cases
	public void Screenshotcapture(String result) throws IOException
	{
		File snsht=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(snsht, new File("./screenshots/"+ result +" " + System.currentTimeMillis()+".jpg"));

	}

	
}
