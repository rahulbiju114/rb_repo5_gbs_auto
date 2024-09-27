package testscripts;

import org.testng.annotations.Test;

import Pages.ClassCatalogue_Page2;
import Pages.LoginPage_GBS;
import Pages.SchoolManagement_Page;

public class ClassCatalogue_MapCompareBranch extends LoadBrowser {

	@Test

	public void enterCrendentials() throws Exception {

		String uA1 = "scs@getnada.com";
		String pA1 = "scs";

		LoginPage_GBS login1 = new LoginPage_GBS(driver);
		login1.enterUsname(uA1);
		login1.enterPass(pA1);
		login1.signButton();

		ClassCatalogue_Page2 classCatalogue = new ClassCatalogue_Page2(driver);
		classCatalogue.clickClassCatalogue();
		classCatalogue.clickClassFee();
		classCatalogue.clickSearch2();
		classCatalogue.foundSearchResults();

		SchoolManagement_Page sManage1 = new SchoolManagement_Page(driver);
		sManage1.clickSchoolMang();
		sManage1.clickMapDelete();
		sManage1.clickMapProcced();
		sManage1.deleteAlert();
	}
}
