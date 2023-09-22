package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ManageLocationPage extends PageUtility{

	WebDriver driver;

	public ManageLocationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-map-marker']")
	private WebElement manageLocation;
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newBtn;
	
	@FindBy(xpath = "//select[@id='country_id']")
	private WebElement countryId;
	
	@FindBy(xpath = "//select[@name='state_id']")
	private WebElement state;
	
	@FindBy(xpath = "//input[@name='location']")
	private WebElement location;
	
	@FindBy(xpath = "//input[@name='delivery']")
	private WebElement delivery;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alert;
	
	public void NavigateToManageLocation() {
		ClickElement(manageLocation);
	}
	
	public void enterLocationInfo() {
		ClickElement(newBtn);
		SelectFromStaticDropdown(countryId, "United Kingdom");
		SelectFromStaticDropdown(state, "Bristol");
		SetTextBox(location, "Tvm");
		SetTextBox(delivery, "45");
		ClickElement(saveBtn);
	
	}
	
	public String ValidateManageLocation() {
		return GetElementText(alert);
	}


}


