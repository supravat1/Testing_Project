package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
	
@Test
	
	public void script6()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"Radio Button\"]")).click();
		
		driver.findElement(By.id("no")).click();
		
		driver.findElement(By.name("news")).click();
		
		driver.findElement(By.xpath("//input[@value=\"2\"]")).click();
		
		driver.close();

	}
}
