package com.Webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetCommands {


@Test
	
	public void scipt2() throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.get("http://www.leafground.com/");
	
	String s1 = driver.getTitle();
	System.out.println("Title is : "+s1);
	

	driver.findElement(By.xpath("//img[@alt=\"Alert\"]")).click();
	String s2 = driver.getCurrentUrl();
	System.out.println("Current url is : "+s2);
	
	
	driver.findElement(By.xpath("//button[@onclick=\"normalAlert()\"]")).click();
	Alert ale = driver.switchTo().alert();
	String s3 = ale.getText();
	System.out.println("Text inside alert is : "+s3);
	
	ale.accept();

	String s4 = driver.getPageSource();
	System.out.println("Source code is : "+s4);
	
	
	
	
	
	}
	
}
