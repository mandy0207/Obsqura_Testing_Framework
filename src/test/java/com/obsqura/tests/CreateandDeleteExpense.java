package com.obsqura.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;

public class CreateandDeleteExpense  extends BaseTest{
	
	@Test
	public void MyCreateDeleteExpense() {
		
		lp.Login();
		hp.NavigateToManageExpense();
	
		String date=DateUtility.GetCurrentDate();
		ecp.CreateUniqueTitle(date);
		ecp.ValidateUniqueNameIsCreated();
		ecp.DeleteExpenseCategory(date);
		
			
	}
}
