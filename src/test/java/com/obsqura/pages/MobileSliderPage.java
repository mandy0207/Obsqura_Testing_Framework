package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class MobileSliderPage extends PageUtility{
	WebDriver driver;

	public MobileSliderPage(WebDriver driver) {
        super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-window-minimize']")
	private WebElement mobileSlider;
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newBtnClick;
	
	@FindBy(xpath = "//select[@name='cat_id']")
	private WebElement category;
	
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertMsg;
	
	
	public void NavigateToMobileSlider() {
		ClickElement(mobileSlider);
	}
	
	public void CreateNewMobileSlider() throws InterruptedException {
		ClickElement(newBtnClick);
		SelectFromStaticDropdown(category, "Fruits");
		ClickElement(saveBtn);
	}
	
	public String ValidateMobileSlider() {
		return GetElementText(alertMsg);
	}
}
