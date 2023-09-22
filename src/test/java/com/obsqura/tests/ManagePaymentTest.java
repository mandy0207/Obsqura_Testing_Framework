package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManagePaymentTest extends BaseTest {

	@Test
	public void MyManagePayment() {
		lp.Login();
		mpp.NavigateToManagePayment();
		mpp.CreateEditAndUpdate();

		String alertMessage = mpp.ValidateManagePayment();
		if (alertMessage.contains("Payment Method Updated Successfully")) {
			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}

	}

}
