package com.Webdriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TakesScreenshotConcept {
	
	
		@Test
			
			public void script5() throws InterruptedException, IOException
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://demo.automationtesting.in/Selectable.html");
				
				driver.findElement(By.xpath("//a[@href=\"#Serialize\"]")).click();
				
				List <WebElement> element = driver.findElements(By.xpath("//ul[@class=\"SerializeFunc\"]/li"));
				int size = element.size();
				System.out.println(size);
				
				Actions act = new Actions(driver);
				
				act.keyDown(Keys.CONTROL)
					.click(element.get(0))
					.click(element.get(1))
					.click(element.get(5))
					.click(element.get(6))
					.build().perform();
				
				System.out.println("You have selected "+driver.findElement(By.xpath("//span[@id=\"result\"]")).getText());

				TakesScreenshot scr1 = (TakesScreenshot) driver;
				
				File source =  scr1.getScreenshotAs(OutputType.FILE);
				
				File destination = new File("F:\\eclipse-workspace\\Selenium_Webdriver\\src\\test\\java\\com\\Webdriver\\screen1.jpg");
				
				FileHandler.copy(source, destination);
				
				driver.close();
				
				
				//Drawbacks: 1. It doesn't take the screenshot of complete page.
				//			 2. It doesn't take the screenshot of alert pop-up.
				
				
			}
	
}
