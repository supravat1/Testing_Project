package com.Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandling {

@Test
	
	public void script5() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		
		
		driver.findElement(By.xpath("//img[@alt=\"Frame\"]")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement element = driver.findElement(By.xpath("//iframe[@src=\"page.html\"]"));
		
		driver.switchTo().frame(element);
		
		
		WebElement element1 = driver.findElement(By.xpath("//iframe[@src=\"nested.html\"]"));
		
		driver.switchTo().frame(element1);
		
		driver.findElement(By.id("Click1")).click();
		
		
		driver.switchTo().defaultContent();
		
		
		List <WebElement> element2 = driver.findElements(By.xpath("//iframe"));
		System.out.println(element2.size());
		
		driver.close();
		
		
	}
}
