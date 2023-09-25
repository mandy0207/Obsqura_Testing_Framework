package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;

public class CreateDeliveryBoy extends BaseTest{
	
	
	@Test(groups= {"Smoke"})
	public void CreateDeliveryBoyTest() {
		lp.Login();
		hp.NavigateTo_ManageDeliverBoy();
		String date= DateUtility.GetCurrentDate();
		ldp.CreateDeliveryBoy(date);
		
<<<<<<< HEAD
		ldp.ValidateDeliveryBoyIsCreated();	
=======
		String alertMsg = ldp.ValidateDeliveryBoyIsCreated();
		
		if(alertMsg.contains("Delivery Boy Details Created Successfully")) {
			Assert.assertTrue(true);
		}else {
			Assert.fail();
		}


		
>>>>>>> b96ebcb734998ab3b405267ddf5fc5575a35ee4f
	}
	
	

}
