package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageLocationTest extends BaseTest {

	@Test
	public void MyManageLocationTest() {

		lp.Login();
		mp.NavigateToManageLocation();
		mp.enterLocationInfo();

		String alertMsg = mp.ValidateManageLocation();

		if (alertMsg.contains("Location Created Successfully")) {
			Assert.assertTrue(true);
		} else {
			Assert.fail();
		}

	}
}
