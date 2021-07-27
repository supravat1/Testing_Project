package com.Webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.Test;

public class Config_Practice {
	
	WebDriver driver;
	
@Test
	
	public void script1() throws Exception {
	
	
	Properties prop = new Properties();
	
	FileInputStream fis1 = new FileInputStream("F:\\eclipse-workspace\\Selenium_Webdriver\\src\\test\\java\\com\\Webdriver\\config.properties");
	
	prop.load(fis1);
	
	String browser = prop.getProperty("browser");
	System.out.println("browser");
	
	String url = prop.getProperty("url");
	System.out.println(url);
	
	String path = prop.getProperty("path");
	System.out.println(path);
	
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("supravatmishra@gmail.com");
		
		driver.findElement(By.xpath("//input[@value=\"Append \"]")).clear();

		driver.findElement(By.xpath("//input[@value=\"Append \"]")).sendKeys("JEDI");
		
		driver.close();
	}
		
	else if(browser.equalsIgnoreCase("firefox"))
	{
		System.out.println("Operations are to be done on firefox browser");
	}

}

	
		
		

}
