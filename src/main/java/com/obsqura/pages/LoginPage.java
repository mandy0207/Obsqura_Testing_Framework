package com.obsqura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This @FindsBy technique is called PageFactory Concept
	 */

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;


	@FindBy(css ="input[placeholder='Password']")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;
	
	
	public void Login() {
	    username.sendKeys("admin");
		password.sendKeys("admin");
		submitBtn.click();
	}

}
