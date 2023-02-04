package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	//Constructor
	public void LoginPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	// Element List
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@name='login']") WebElement SIGNIN_BUTTON_ELEMENT;

	// Corresponding Methods
	public void insertUserName(String username) {
		USER_NAME_ELEMENT.sendKeys(username);
		
	}
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
		
	}
	public void clickOnSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
		
	}
	public void login(String username, String password) {
		USER_NAME_ELEMENT.sendKeys(username);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_BUTTON_ELEMENT.click();
	}
}
