package com.obsqura.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.obsqura.utilities.TestProperties;

public class BaseTest {
	WebDriver driver;


	@BeforeClass
	public void InitializeDriver() throws IOException {
		Properties prop = TestProperties.GetProperties();
		String browserName=prop.getProperty("browser");
		String Environment = prop.getProperty("Environment");
		String Url = prop.getProperty(Environment);
        System.out.println(Environment);
		System.out.println(browserName);
		
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
		driver.get(Url);

	}
	
	@AfterClass
	public void TearDown() {

		driver.quit();
	}
}
