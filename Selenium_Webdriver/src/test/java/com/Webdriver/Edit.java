package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Edit {

	@Test
	
	public void script1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"Edit / Text Fields\"]")).click();
		
		driver.findElement(By.id("email")).sendKeys("supravatmishra@gmail.com");
		
		driver.findElement(By.xpath("//input[@value=\"Append \"]")).clear();

		driver.findElement(By.xpath("//input[@value=\"Append \"]")).sendKeys("JEDI");
		
		driver.findElement(By.name("username")).clear();
		
		driver.findElement(By.xpath("//input[@value=\"Clear me!!\"]")).clear();
		
		driver.findElement(By.xpath("//input[@value=\"Clear me!!\"]")).sendKeys("Okay");
		
		driver.close();
	}
}
