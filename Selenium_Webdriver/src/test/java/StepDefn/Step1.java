package StepDefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step1 {

	WebDriver driver;
	
	@Given("Open Chrome and URL of the Application")
	public void open_chrome_and_url_of_the_application() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();

		driver.get("https://store.steampowered.com/login/?redir=&redir_ssl=1&snr=1_4_4__global-header");
		
	}
	
	@When("Enter Steam Account Name and Password")
	public void enter_steam_account_name_and_password() {
		
		driver.findElement(By.id("input_username")).sendKeys("supravatmishra@gmail.com");
		
		driver.findElement(By.id("input_password")).sendKeys("qwerty123");
		
		driver.findElement(By.xpath("//button[@class=\"btn_blue_steamui btn_medium login_btn\"]")).click();
	  
	}
	
	@Then("Login to account")
	public void login_to_account() {
	    System.out.println("Login to account");
	}
	
	
}
