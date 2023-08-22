package com.obsqura.tests;

import org.testng.annotations.Test;

import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.utilities.DateUtility;

public class CreateandDeleteExpense  extends BaseTest{

	@Test
	public void MyCreateDeleteExpense() {
		
		LoginPage lp = new LoginPage(driver);
		lp.Login();
		
		HomePage hp = new HomePage(driver);
		hp.NavigateToManageExpense();
		//System.out.println(DateUtility.GetCurrentDate());
		
		
		
	}
}
