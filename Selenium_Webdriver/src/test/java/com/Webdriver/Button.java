package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button {

	@Test
	
	public void scipt2()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.get("http://www.leafground.com/");
	
	driver.findElement(By.xpath("//img[@alt=\"Buttons\"]")).click();
	
	driver.findElement(By.id("home")).click();
	
	driver.findElement(By.xpath("//img[@alt=\"Buttons\"]")).click();
	
	
	WebElement element = driver.findElement(By.xpath("//button[@id=\"position\"]"));
	
	//For Location
	Point p = element.getLocation();
	
	int x = p.getX();
	int y = p.getY();
	
	System.out.println("x-axis="+x+ "y-axis "+y);
	
	//For Color
	WebElement element1 = driver.findElement(By.id("color"));
	
	String s1 = element1.getAttribute("style");
	
	System.out.println(s1);
	
	//For Height and Width
	WebElement element2 = driver.findElement(By.id("size"));
	
	Dimension dim = element2.getSize();
	
	int a = dim.getHeight();
	int b = dim.getWidth();
	
	System.out.println("Height = "+a+" Width = "+b);
	
	
	}
}
