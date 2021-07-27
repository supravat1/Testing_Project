package com.Webdriver;


import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotScreenshotConcept {
	
@Test
	
	public void script() throws AWTException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"Alert\"]")).click();
		
		driver.findElement(By.xpath("//button[@onclick=\"normalAlert()\"]")).click();
		
		

		Robot robot1 = new Robot();
		
		Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect = new Rectangle(screen_size);
		
		BufferedImage source  =  robot1.createScreenCapture(rect);
		
		File destination = new File("F:\\eclipse-workspace\\Selenium_Webdriver\\src\\test\\java\\com\\Webdriver\\screenshot2.jpg");
		
		ImageIO.write(source, "jpg", destination);
		
		driver.quit();
		
	
		
	}
	
}

