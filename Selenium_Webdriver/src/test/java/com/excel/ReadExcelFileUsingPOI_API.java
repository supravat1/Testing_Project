// package com.excel;

// import java.io.File;
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.util.concurrent.TimeUnit;

// import org.apache.poi.ss.usermodel.Row;
// import org.apache.poi.xssf.usermodel.XSSFSheet;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.testng.annotations.Test;

// public class ReadExcelFileUsingPOI_API {

// @Test
	
// 	public void script1() throws Exception
// 	{
// 		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supra\\Downloads\\ChromeDriver_selenium\\chromedriver.exe");
		
// 		WebDriver driver = new ChromeDriver();

		
// 		String file1 = ("C:\\Users\\supra\\Desktop\\HCL_Selenium_Training_Assignments\\Excel_POI.xlsx");
		
// 		File f1 = new File(file1);
		
// 		FileInputStream fis = new FileInputStream(f1);
		
// 		XSSFWorkbook workbook1 = new XSSFWorkbook(fis);
		
// 	 	XSSFSheet sheet1 = workbook1.getSheetAt(0);
	 	
// 	 	int rowcount = sheet1.getLastRowNum();
// 	 	System.out.println(rowcount);
// //	 	String s1 = sheet1.getRow(1).getCell(0).getStringCellValue();
// //	 	System.out.println(s1);

// 	 	for(int i =1; i< rowcount+1; i++)
// 	 	{
// 	 		String username = sheet1.getRow(i).getCell(0).getStringCellValue();
// 	 		String password = sheet1.getRow(i).getCell(1).getStringCellValue();
	 		
// //	 		System.out.println(username);
// //	 		System.out.println(password);
	 		
// 	 		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 		
// 	 		driver.get("https://www.netflix.com/in/login");
	 		
// 	 		driver.manage().window().maximize();
	 		
// 	 		driver.findElement(By.id("id_userLoginId")).clear();
	 		
// 	 		driver.findElement(By.id("id_userLoginId")).sendKeys(username);
	 		
// 	 		driver.findElement(By.id("id_password")).sendKeys(password);
	 		
// 			driver.findElement(By.xpath("//button[@class=\"btn login-button btn-submit btn-small\"]")).click();

			
// 	 	}
	 	
// 	 	driver.close();
// 		workbook1.close();
		
		
// 	}
// }
