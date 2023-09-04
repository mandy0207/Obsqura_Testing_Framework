package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;

public class CreateandDeleteExpense  extends BaseTest{
	
	@Test
	public void MyCreateDeleteExpense() throws IOException {
		
		lp.Login();
		hp.NavigateToManageExpense();
	
		String date=DateUtility.GetCurrentDate();
		ecp.CreateUniqueTitle(date);
		ecp.ValidateUniqueNameIsCreated();
		ecp.DeleteExpenseCategory(date);
	  //  Assert.fail();
			
	}

}
