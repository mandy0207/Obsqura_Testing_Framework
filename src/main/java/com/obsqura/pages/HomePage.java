package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class HomePage extends PageUtility {

	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[contains(text(),'Manage Product')]")
	private WebElement manageProduct;
	
	@FindBy(xpath = "(//*[contains(text(),'Manage Expense')])[1]")
	private WebElement manageExpenseDropdown;
	
	@FindBy(xpath = "(//*[normalize-space() = 'Expense Category'])[1]")
	private WebElement manageExpense;
	
	public void NavigateToManageProduct() {
		
		ClickElement(manageProduct);
	}
	
	public void NavigateToManageExpense() {
		ClickElement(manageExpenseDropdown);
		ClickElement(manageExpense);
	}
}
