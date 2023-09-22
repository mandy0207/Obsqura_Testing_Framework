package com.obsqura.tests;

import org.testng.annotations.Test;

public class ResetTest extends BaseTest{

	@Test
	public void MyReset() {
		lp.Login();
		hp.NavigateToManageProduct();
		//pp.ResetBtn();
	}
}
