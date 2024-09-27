package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassCatalogue_Page2 {

	public WebDriver driver;

	public ClassCatalogue_Page2(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[normalize-space()='Class Catalogue'])[1]") // Click Class Catalogue
	WebElement classCat;

	public void clickClassCatalogue() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		classCat.click();
	}

	@FindBy(xpath = "(//a[normalize-space()='Class Fee'])[1]") // Click Class Fee
	WebElement classFee;

	public void clickClassFee() {
		classFee.click();
	}

	@FindBy(xpath = "//input[@type='search']") // Click Search
	WebElement serachBranch;

	public void clickSearch() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		serachBranch.click();
		serachBranch.sendKeys("Kollam");
	}

	@FindBy(xpath = "//td[@class='dataTables_empty']") // Display No Results
	WebElement serachNoResults;

	public void noSearchResults() {

		System.out.println("Display Message : " + serachNoResults.getText());
	}

	public void clickSearch2() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // search
		serachBranch.click();
		serachBranch.sendKeys("TVM");
	}

	public void foundSearchResults() { // search found

		System.out.println("Display Message : Results are found, therefore branch no need to be deleted");
	}

}
