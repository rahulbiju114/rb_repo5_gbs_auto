package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_GBS {

	public WebDriver driver;

	public LoginPage_GBS(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']") // Username
	WebElement userName1;

	public void enterUsname(String usnameA) {

		userName1.sendKeys(usnameA);
	}

	@FindBy(xpath = "//input[@id='password']") // Password
	WebElement password1;

	public void enterPass(String passA) {

		password1.sendKeys(passA);
	}

	@FindBy(xpath = "//button[@class='btn btn-primary d-block w-100']") // SignIn Button
	WebElement signButton1;

	public void signButton() {

		signButton1.click();

	}
}
