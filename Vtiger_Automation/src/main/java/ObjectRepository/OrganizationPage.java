package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createIcon;
	@FindBy(name = "accountname")
	private WebElement organizationNameTextField;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreateIcon() {
		return createIcon;
	}
	public WebElement getOrganizationNameTextField() {
		return organizationNameTextField;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
}
