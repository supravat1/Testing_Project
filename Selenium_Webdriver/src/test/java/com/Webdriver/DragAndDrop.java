package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

@Test
	
	public void script5() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@alt=\"Draggable\"]")).click();
		
		WebElement web = driver.findElement(By.id("draggable"));
		
		Thread.sleep(5);
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(web, 278, 120).build().perform();
		
		driver.close();
	
		
	
	}
}
