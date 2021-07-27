package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTipConcept {

@Test
	
	public void scipt1()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.get("http://www.leafground.com/pages/tooltip.html");
	
	
	//Using getAttribute method
	
//	WebElement el = driver.findElement(By.id("age"));
//
//	String title1 = el.getAttribute("title");
//	System.out.println(title1);
	
	
	
	//Using the Action Class
	
	Actions act = new Actions(driver);
	WebElement el1 = driver.findElement(By.id("age"));
	
	act.moveToElement(el1).perform();
	
	WebElement element1 = driver.findElement(By.xpath("//div[@class=\"ui-tooltip-content\"]"));
	
	String text1 = element1.getText();
	System.out.println("ToolTip Text : " +text1);
	
	driver.close();
	
	}
}
