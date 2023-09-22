package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileSliderTest extends BaseTest{

	@Test
	public void MyMobileSlider() throws InterruptedException {
		lp.Login();
		ms.NavigateToMobileSlider();
		ms.CreateNewMobileSlider();
		
		/* Validation part */
		
		String alertTeext = ms.ValidateMobileSlider();
		if(alertTeext.contains("Mobile Slider Created Successfully")) {
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}
	}
	
}
