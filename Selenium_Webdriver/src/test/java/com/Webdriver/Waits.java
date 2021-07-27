package com.Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Waits {

@Test
	
	public void scipt2() throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.get("http://www.leafground.com/");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//img[@alt=\"Buttons\"]")).click();
	
	driver.findElement(By.id("home")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, 2);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//img[@alt=\"Alert\"]"))));
	
	driver.findElement(By.xpath("//img[@alt=\"Alert\"]")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//button[@onclick=\"normalAlert()\"]")).click();
	
	FluentWait<WebDriver> flu_wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(10,TimeUnit.SECONDS )
		       .pollingEvery(5, TimeUnit.SECONDS)
		       .ignoring(Exception.class);

	driver.switchTo().alert().accept();
	
	driver.close();
		
		
		
		
		
		
		
		
		
	}
		
}
