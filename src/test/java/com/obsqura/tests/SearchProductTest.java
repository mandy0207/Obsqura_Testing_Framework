package com.obsqura.tests;

import org.testng.annotations.Test;

import com.obsqura.pages.HomePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ProductsPage;

public class SearchProductTest extends BaseTest {

	
	@Test
	public void MySearchProductTest() {
		
		LoginPage lp = new LoginPage(driver);
		lp.Login();
		
		HomePage hp = new HomePage(driver);
		hp.NavigateToManageProduct();
		
		ProductsPage pp = new ProductsPage(driver);
		pp.ClickSearchBtn();
		pp.ValidateSearchProduct("Maggi");
	}
}
