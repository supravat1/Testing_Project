package com.Webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {

@Test
	
	public void script5() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

	
		driver.get("https://demoqa.com/browser-windows");
		

		driver.findElement(By.xpath("//button[@id=\"windowButton\"]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> iter = handles.iterator();
		
		String parent = iter.next();
		System.out.println("Parent Window ID: "+parent);
		
		String child = iter.next();
		
		System.out.println("Child Window ID: "+child);
		
		driver.switchTo().window(child);
		Thread.sleep(3000);
		System.out.println("Child window title: "+driver.getTitle());
		
		
		driver.switchTo().window(parent);
		System.out.println("Parent window title: "+driver.getTitle());
		
		driver.quit();
		
		
		
		
	}
}
