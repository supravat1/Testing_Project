package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropbox {

	@Test
	
	public void script4()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"ListBox\"]")).click();
		
		Select sel = new Select(driver.findElement(By.id("dropdown1")));
		sel.selectByIndex(1);
		
		Select sel1 = new Select(driver.findElement(By.name("dropdown2")));
		sel1.selectByValue("3");
		
		Select sel2 = new Select(driver.findElement(By.name("dropdown3")));
		sel2.selectByVisibleText("Loadrunner");
		
		Select sel3 = new Select(driver.findElement(By.xpath("//select[@class = \"dropdown\"]")));
		sel3.selectByValue("2");
		
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Selenium");
		
		Select sel4 = new Select(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select")));
		sel4.selectByIndex(2);
		sel4.selectByIndex(3);
		
		sel4.deselectAll();
		
		driver.close();
		
		
	}
}

