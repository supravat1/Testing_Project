package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation_And_Manage {

	@Test

	public void script1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");

		driver.findElement(By.xpath("//img[@alt=\"Edit / Text Fields\"]")).click();

		driver.navigate().back();
		System.out.println("Page backward");

		driver.navigate().forward();
		System.out.println("Page forward");

		driver.findElement(By.id("email")).sendKeys("supravatmishra@gmail.com");

		driver.findElement(By.xpath("//input[@value=\"Append \"]")).clear();

		driver.findElement(By.xpath("//input[@value=\"Append \"]")).sendKeys("JEDI");

		driver.navigate().refresh();
		System.out.println("Page refresh");

		driver.navigate().to("https://www.cowin.gov.in/");
		System.out.println("Page navigated to https://www.cowin.gov.in/");

		driver.manage().window().maximize();
		System.out.println("Window Maximized");

		Dimension dim = driver.manage().window().getSize();
		System.out.println("Current window size : " + dim);

		Dimension dim1 = new Dimension(350, 450);
		driver.manage().window().setSize(dim1);
		System.out.println("Current window size : " + dim1);

		driver.close();

	}
}
