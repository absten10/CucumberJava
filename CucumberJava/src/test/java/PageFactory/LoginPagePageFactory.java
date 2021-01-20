package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePageFactory {

	@FindBy(id="name")
	WebElement element_Username;
	
	@FindBy(id="password")
	WebElement element_Password;
	
	@FindBy(id="login")
	WebElement element_Login;
	
	@FindBy(id="logout")
	WebElement element_Logout;
	
	WebDriver driver;
	
	public LoginPagePageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setUsername(String Username) {
		element_Username.sendKeys(Username);
	}
	
	public void setPassword(String Password) {
		element_Password.sendKeys(Password);
	}
	
	public void clickLogin() {
		element_Login.click();
	}
	
	public void checkLogout() {
		element_Logout.isDisplayed();
	}
}
