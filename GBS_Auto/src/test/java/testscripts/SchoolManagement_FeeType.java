package testscripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Pages.LoginPage_GBS;
import Pages.SchoolManagement_Page;

public class SchoolManagement_FeeType extends LoadBrowser {
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
		sManage1.LocateManageFee();
		sManage1.clickAddFeeType();
		sManage1.enterFeeType();
		sManage1.clickCheckBox();
		sManage1.clickCancel();
		sManage1.enterSerach2();
		sManage1.clickEntries();
		sManage1.clickEntriesValue();
		sManage1.clickEdit2();
		sManage1.clickCancel3();
}
  
}
