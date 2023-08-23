package com.obsqura.tests;

import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;

public class CreateDeliveryBoy extends BaseTest{
	
	
	@Test
	public void CreateDeliveryBoyTest() {
		lp.Login();
		hp.NavigateTo_ManageDeliverBoy();
		
		
	}

}
