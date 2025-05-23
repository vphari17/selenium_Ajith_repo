package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	@FindBy (xpath = "//img[@title='Create Contact...']")
	private WebElement createIcon;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public ContactPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateIcon() {
		return createIcon;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
}
