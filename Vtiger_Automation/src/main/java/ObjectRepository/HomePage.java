package ObjectRepository;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(linkText = "Contacts")
private WebElement contactsLink;

@FindBy(linkText = "Organizations")
private WebElement organizationsLink;

@FindBy(xpath = "//img[src='themes/softed/images/user.PNG']")
private WebElement profileIcon;

@FindBy(linkText = "Sign Out")
private WebElement signOutLink;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getContactsLink() {
	return contactsLink;
}

public WebElement getOrganizationsLink() {
	return organizationsLink;
}

public WebElement getProfileIcon() {
	return profileIcon;
}

public WebElement getSignOutLink() {
	return signOutLink;
}


}
