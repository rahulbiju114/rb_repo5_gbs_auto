package testscripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Pages.LoginPage_GBS;
import Pages.SchoolManagement_Page;

public class SchoolManagement_DeleteBranch extends LoadBrowser {

	@Test

	public void enterCrendentials() throws AWTException {

		String uA1 = "scs@getnada.com";
		String pA1 = "scs";

		LoginPage_GBS login1 = new LoginPage_GBS(driver);
		login1.enterUsname(uA1);
		login1.enterPass(pA1);
		login1.signButton();

		SchoolManagement_Page sManage1 = new SchoolManagement_Page(driver);

		sManage1.clickSchoolMang();
		sManage1.clickDelete();
		sManage1.clickProcced();

	}
}
