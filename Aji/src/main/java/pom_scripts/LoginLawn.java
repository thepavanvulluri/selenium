package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLawn extends BasePage{
	public LoginLawn(WebDriver driver) {
		// TODO Auto-generated constructor stub
	super(driver);
	}
	
	@FindBy(xpath  = "//button[text()='Sign In']")
	WebElement signIn;
	
	public void clickOnSignIn() {
		clickAction(signIn);
		
	}
	
	@FindBy(id = "username")
	WebElement emailTFL;
	
	public void enterValueInEmailLawn(String email) {
		enter_value(emailTFL, email);
		
	}
	
	
	@FindBy(xpath  = "//input[@type=\"password\"]")
	WebElement passTFL;
	
	public void enterValueInPwd(String pwd) {
		enter_value(passTFL, pwd);
	}
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement submitBTN;
	
	public void clickOnSubmit() {
		clickAction(submitBTN);
	}
	
}
