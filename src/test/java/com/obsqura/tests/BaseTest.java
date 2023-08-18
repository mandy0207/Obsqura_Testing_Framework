package com.obsqura.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	WebDriver driver;


	@BeforeClass
	public void InitializeDriver() {
		
		String browserName = "Chrome";
		if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();
		}

		else if (browserName.equals("Edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please Choose Correct BrowserName");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");

	}
	
	@AfterClass
	public void TearDown() {
		driver.quit();
	}
}
