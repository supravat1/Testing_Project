package com.Webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo_Alert {

@Test
	
	public void script5() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[@href=\"#OKTab\"]")).click();
		
		driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click();
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		System.out.println(al.getText());
		al.dismiss();
		
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		al.sendKeys("WARRIOR");
		Thread.sleep(3000);
		al.accept();
		
		driver.close();
		
		

	}
}
