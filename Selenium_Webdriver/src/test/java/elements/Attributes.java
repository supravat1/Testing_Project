package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Attributes {

	
	@FindBy(id = "login-username")
	public static WebElement emailID;
	
	
	@FindBy(id = "login-signin")
	public static WebElement nextButton;



	
	
//	public static WebElement emailID(WebDriver driver)
//	{
//		return driver.findElement(By.id("login-username"));
//	}
	
	
//	public static WebElement nextButton(WebDriver driver)
//	{
//		return driver.findElement(By.id("login-signin"));
//	}
}
