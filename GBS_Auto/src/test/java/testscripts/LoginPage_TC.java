package testscripts;

import org.testng.annotations.Test;

import Pages.LoginPage_GBS;

public class LoginPage_TC extends LoadBrowser {
  @Test
  public void enterCrendentials() {
	  
	  String uA1 = "scs@getnada.com";     			
	  String pA1 = "scs";
	  
	 LoginPage_GBS login1 = new LoginPage_GBS(driver);
	 login1.enterUsname(uA1);
	 login1.enterPass(pA1);
	 login1.signButton();
	  
  }
}
