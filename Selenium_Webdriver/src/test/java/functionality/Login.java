package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import elements.Attributes;

public class Login {
	
	
@Test
	
	public void scipt2()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://login.yahoo.com/");
	
	PageFactory.initElements(driver,Attributes.class);
	
	
	Attributes.emailID.sendKeys("Supravatmishra@yahoo.com");
	
	Attributes.nextButton.click();
	
	
//	Attributes.emailID(driver).sendKeys("Supravatmishra@yahoo.com");
	
//	Attributes.nextButton(driver).click();
	
	driver.close();
	
	
	}
}
