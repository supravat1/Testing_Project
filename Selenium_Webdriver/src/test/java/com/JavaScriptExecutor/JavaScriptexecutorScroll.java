package com.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptexecutorScroll {
	
@Test
	
	public void scipt() throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.moneyboat.co.uk/login/");
	Thread.sleep(5000);
	driver.manage().window().maximize();
	
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0,600)");
	


//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	String titleText =  js.executeScript("return document.title;").toString();
//	System.out.println(titleText);
	
	
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("alert('Alert is visible')");

//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("history.go(0)");
	
	
	
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("document.getElementById('logo').click()");
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String url=  js.executeScript("return document.URL;").toString();
	System.out.println(url);
	
	
	}
}
