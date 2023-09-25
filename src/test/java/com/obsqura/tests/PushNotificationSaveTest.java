package com.obsqura.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PushNotificationSaveTest extends BaseTest{

	@Test
	public void MyPushSaveTest() {
		lp.Login();
		pn.PushNotification();
		String title = null;
		pn.TitleForPushNotification(title);
		pn.DescriptionForPushNotification();
		pn.SaveFunctionality();
		
		
		String alertText = pn.validatePushNotificationPage();
		if(alertText.contains("Message send successfully")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}

	}
}
