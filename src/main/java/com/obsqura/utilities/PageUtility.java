package com.obsqura.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUtility {

	WebDriver driver;
	WebDriverWait wait;
	public PageUtility(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver, Duration.ofSeconds(8));
	}
	
	
	/**
	 * Utility or wrapper for ClickElement
	 * @param element
	 */
	public void ClickElement(WebElement element) {
		element.click();
	}
	
	
	public void SetTextBox(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public void SelectFromStaticDropdown(WebElement dropdown, String value) {
		 Select staticDropdown = new Select(dropdown);
	     staticDropdown.selectByValue(value);
		
	}
	/**
	 * Homework
	 * @param element
	 */
	public void WaitUntilVisible(WebElement element) {
	
	}
}