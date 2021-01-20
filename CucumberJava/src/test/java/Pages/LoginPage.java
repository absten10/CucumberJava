package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver = null;
	
	By username = By.id("name");
	By password = By.id("password");
	By login = By.id("login");
	By logout = By.id("logout");

	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void setUsername(String Username) {
		driver.findElement(username).sendKeys(Username);
	}

	public void setPassword(String Password) {
		driver.findElement(password).sendKeys(Password);
	}

	public void clickLogin() {
		driver.findElement(login).click();
	}
	
	public void checkLogout() {
		driver.findElement(By.id("logout")).isDisplayed();
	}

}
