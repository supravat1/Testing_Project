package com.Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Checkbox {

@Test
	
	public void script5()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"Checkbox\"]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		
		boolean b =	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input")).isSelected();
	
		System.out.println(b);
	
		
		List <WebElement> web = driver.findElements(By.xpath("//div[@class=\"example\"][4]//div/input"));
		
		for(int i = 0; i < web.size(); i++)
		{
			web.get(i).click();
		}
	
		
	
//		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[1]/input")).click();
//		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[2]/input")).click();
//		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[3]/input")).click();
//		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[4]/input")).click();
//		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div[5]/input")).click();
//		
		driver.close();
//		
		}
		
	}

