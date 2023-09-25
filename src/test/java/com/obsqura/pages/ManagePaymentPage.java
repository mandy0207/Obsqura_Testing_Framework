package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ManagePaymentPage extends PageUtility{

	WebDriver driver;

	public ManagePaymentPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-credit-card']")
	private WebElement managePayment;
	
	@FindBy(xpath = "//i[@class='fas fa-edit']")
	private WebElement editOption;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement titleOfPayment;
	
	@FindBy(xpath = "//input[@name='limit']")
	private WebElement limitOfPayment;
	
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-info']")
	private WebElement updateBtn;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertMsg;
	
	
	public void NavigateToManagePayment() {
		ClickElement(managePayment);
	}
	
	public void CreateEditAndUpdate() {
		ClickElement(editOption);
		SetTextBox(titleOfPayment, "First Payment");
		SetTextBox(limitOfPayment, "200");
		ClickElement(updateBtn);
	}
	public String ValidateManagePayment() {
		return GetElementText(alertMsg);
	}
	
}
