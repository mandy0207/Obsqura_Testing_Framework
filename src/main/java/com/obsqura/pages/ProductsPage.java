package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	
	WebDriver driver;

	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//input[@placeholder='Title']")
	private WebElement title_input;
	
	
	public void ClickSearchBtn() {
		searchBtn.click();
	}
	
	public void ValidateSearchProduct(String productName) {
		title_input.sendKeys(productName);
	}
}