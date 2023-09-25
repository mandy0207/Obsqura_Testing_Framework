package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class PushNotificationPage extends PageUtility{

	WebDriver driver;

	public PushNotificationPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-fas fa-bell']")
	private WebElement pushNotification;
	
	@FindBy(xpath = "//input[@placeholder='Enter Title']")
	private WebElement title;
	
	@FindBy(xpath = "//input[@placeholder='Enter Description']")
	private WebElement description;
	
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-info']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertMessage;
	
	public void PushNotification() {
		pushNotification.click();
	}
	
	
	public void TitleForPushNotification(String Name) {
		String  uniqueName= "Obsqura"+ Name;
		SetTextBox(title, uniqueName);
	}
	
	public void DescriptionForPushNotification() {
		SetTextBox(description, "I am Linu");
	}
	
	public void SaveFunctionality() {
		ClickElement(saveButton);
	}
	
	public String validatePushNotificationPage() {
		return GetElementText(alertMessage);
	}
}
