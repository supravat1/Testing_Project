package com.Webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopup {

	
@Test
	
	public void script5() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"Alert\"]")).click();
		
		driver.findElement(By.xpath("//button[@onclick=\"normalAlert()\"]")).click();
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		driver.findElement(By.xpath("//button[@onclick=\"confirmAlert()\"]")).click();
		System.out.println(al.getText());
		al.accept();
		
		driver.findElement(By.xpath("//button[@onclick=\"confirmPrompt()\"]")).click();
		
		al.sendKeys("KI");
		
		al.accept();
		
		driver.findElement(By.xpath("//button[@onclick=\"lineBreaks()\"]")).click();
		System.out.println(al.getText());
		al.accept();
		
		driver.findElement(By.id("btn")).click();
		driver.findElement(By.xpath("//button[@class=\"swal-button swal-button--confirm\"]")).click();
		
	
	}
}
