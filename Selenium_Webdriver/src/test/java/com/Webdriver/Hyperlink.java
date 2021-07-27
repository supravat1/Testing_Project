package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hyperlink {
	
@Test
	
	public void scipt3()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.get("http://www.leafground.com/");
	
	driver.findElement(By.xpath("//img[@alt=\"Link\"]")).click();
	
	driver.findElement(By.linkText("Go to Home Page")).click();
	
	driver.findElement(By.xpath("//img[@alt=\"Link\"]")).click();
	
	String str = driver.getCurrentUrl();
	
	System.out.println(str);
	
	driver.findElement(By.linkText("Verify am I broken?")).click();
	
	String str1 = driver.getCurrentUrl();
	System.out.println(str1);
	
	if(str1 == "HTTP Status 404 – Not Found")
	{
		System.out.println("Broken Link");
	}
	
	
	driver.close();
	}

}
