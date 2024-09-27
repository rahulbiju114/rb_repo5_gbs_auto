package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchoolManagement_Page {

	public WebDriver driver;

	public SchoolManagement_Page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='https://gbs-plus-test.info/lms-master-test/admin-institute']") // Click School
																								// Management
	WebElement schoolMang1;

	public void clickSchoolMang() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		schoolMang1.click();
	}

	@FindBy(xpath = "//button[@class='tf-nc BranchBtn' ]") // Click Add new Branch
	WebElement addBranch;

	public void clickAddBranch() {
		addBranch.click();
	}

	@FindBy(xpath = "//input[@id='add_institute_name' ]") // Enter Branch Name
	WebElement enterName;

	public void enterBranchName() {
		enterName.sendKeys("Kollam");
	}

	@FindBy(xpath = "//div[@class='modal-footer']//button[@class='btn btn-primary saveBtn' and following-sibling::button[text()='Cancel']]") // Click
																																				// save
																																				// button
	WebElement clickSave;

	public void clickSaveButton() {
		clickSave.click();
	}

	@FindBy(xpath = "(//img[@alt='edit'])[2]") // click Edit
	WebElement clickEdit;

	public void clickEdit() {
		clickEdit.click();
	}

	@FindBy(xpath = "(//input[@id='edit_institutename'])[1]") // Edit Branch Name
	WebElement enterEditName;

	public void enterEditBranchName() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		enterEditName.clear();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		enterEditName.sendKeys("WEER");
	}

	@FindBy(xpath = "(//i[@class='fa fa-trash-o'])[2]") // click delete button
	WebElement clickDelete;

	public void clickDelete() {
		clickDelete.click();
	}

	@FindBy(xpath = "(//button[normalize-space()='Proceed'])[1]") // click proceed button
	WebElement clickProceed;

	public void clickProcced() {
		clickProceed.click();
	}

	@FindBy(xpath = "//span[text()='Action completed successfully']") // Display proceed button
	WebElement displayAlert;

	public void displayAlert() {
		System.out.println("Alert Message : " + displayAlert.getText());
	}

	@FindBy(xpath = "//li[@class='treeOne']") // tree structure
	List<WebElement> treeBranches;

	public void treeBranch() {

		for (WebElement branch : treeBranches) {
			System.out.println(branch.getText());

		}
	}

	@FindBy(xpath = "//i[@class='fa fa-trash-o']") // click mapped delete button
	WebElement clickMapDelete;

	public void clickMapDelete() {
		clickMapDelete.click();
	}

	@FindBy(xpath = "//button[normalize-space()='Proceed']") // click proceed button
	WebElement clickMapProceed;

	public void clickMapProcced() {
		clickMapProceed.click();
	}

	@FindBy(xpath = "//span[@class='message' and contains(text(), \"Data can't delete\")]") // delete mapped
	WebElement deleteAlert;

	public void deleteAlert() {
		System.out.println("Alert Message : " + deleteAlert.getText());
	}

}
