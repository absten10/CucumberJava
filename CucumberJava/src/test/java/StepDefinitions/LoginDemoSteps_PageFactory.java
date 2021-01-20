package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.LoginPagePageFactory;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps_PageFactory {
	
	WebDriver driver=null;
	LoginPagePageFactory login;

	
	@Given("Browser is open")
	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();	
		System.out.println("======I'M in Before Test=========");
	}

	@And("User is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String Username, String Password) throws InterruptedException {
//		driver.findElement(By.id("name")).sendKeys(Username);
//		driver.findElement(By.id("password")).sendKeys(Password);
		login= new LoginPagePageFactory(driver);
		login.setUsername(Username);
		login.setPassword(Password);
		Thread.sleep(2000);
	}
	
	@And("user clicks on Login")
	public void user_clicks_on_login() {
		//driver.findElement(By.id("login")).click();
		login.clickLogin();
	}


	
	@Then("User is navigated to the HomePage")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		//driver.findElement(By.id("logout")).isDisplayed();
		
		System.out.println("======I'M in After Test=========");
		login.checkLogout();
		Thread.sleep(2000);
		
		driver.close();
	}


}
