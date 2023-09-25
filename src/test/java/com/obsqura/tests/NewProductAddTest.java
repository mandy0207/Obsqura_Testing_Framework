package com.obsqura.tests;

import org.testng.annotations.Test;

public class NewProductAddTest extends BaseTest{
	
	@Test
	public void MyNewProductAdd() {
		lp.Login();
		hp.NavigateToManageProduct();
		//pp.NewBtn();
	}
}
