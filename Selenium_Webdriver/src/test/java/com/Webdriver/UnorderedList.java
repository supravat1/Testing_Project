package com.Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UnorderedList {

@Test
	
	public void script5() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/AutoComplete.html");
		
		driver.findElement(By.xpath("//input[@id=\"searchbox\"]")).sendKeys("u");
		
		Thread.sleep(5000);
		
		List <WebElement> element = driver.findElements(By.xpath("//ul[@id=\"ui-id-1\"]/li"));
		
		int size = element.size();
		System.out.println(size);
		
		for(WebElement e1 : element)
		{
			if(e1.getText().equalsIgnoreCase("United States"))
			{
				e1.click();
				break;
			}
		}
		
		driver.close();
		
		
	}
}
