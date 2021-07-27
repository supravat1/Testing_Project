package com.Webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookies_Concept {

@Test
	
	public void script5() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/?.src=ym&lang=en-IN&done=https%3A%2F%2Fin.mail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAACJ2K_BGbkCVgeFTO8AuqKCR8HkYqhrPUKC0jCZpPGzKg7IG_6IaRBzgR2nj7n-KTaNF_Et7U6_Nq7jHAubyJO1k7LtgNs8mabedqKlXEWY4y6I3WH2LEbhoYiSqkAGkYaLrUaPs-oZeNT6g8oKeGKpKyVswvJk0D2b2vnuot626");
		
		driver.findElement(By.id("login-username")).sendKeys("supravatmishra@yahool.com");
		
		driver.findElement(By.id("login-signin")).click();
		
		//Add Cookies
		
		String cookiename1 = "cookie1";
		String cookievalue1 = "value";
		
		String cookiename2 = "cookie2";
		String cookievalue2 = "value2";
				
		Cookie cook1 = new Cookie(cookiename1,cookievalue1);
		
		Cookie cook2 = new Cookie(cookiename2, cookievalue2);
		
	
		driver.manage().addCookie(cook1);
		driver.manage().addCookie(cook2);
		
		Set <Cookie> cookies = driver.manage().getCookies();
		
		System.out.println(cookies.size());
		
		for(Cookie getcookies : cookies)
		{
			System.out.println(getcookies);
			
		}
		
	
		//Delete Cookies
		
		driver.manage().deleteCookie(cook2);
		
		driver.manage().deleteCookieNamed("GUC");
		
		//To check the remaining cookies in the url 
		Set <Cookie> cookies1 = driver.manage().getCookies();
		
		System.out.println(cookies1.size());
		
		for(Cookie getcookies1 : cookies1)
		{
			System.out.println(getcookies1);
			
		}
		
		driver.manage().deleteAllCookies();
		
	
		driver.close();
	}
}
