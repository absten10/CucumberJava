//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class GoogleSearchSteps {
//
//	WebDriver driver=null;
//	
//	@Given("browser is open")
//	public void browser_is_open() {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		
//		driver.manage().window().maximize();	
//		}
//	
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step: browser is open");
//	    //throw new io.cucumber.java.PendingException();
//	    driver.navigate().to("https://google.com");
//	}
//
//	@When("user enters the text in textbox")
//	public void user_enters_the_text_in_textbox() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step: user enters text in textbox");
//	   // throw new io.cucumber.java.PendingException();
//		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
//
//		
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step: user hits enter");
//	    //throw new io.cucumber.java.PendingException();
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("Inside Step: user is navigated to the search result");
////	    throw new io.cucumber.java.PendingException();
//		driver.getPageSource().contains("online Courses");
//		driver.close();
//	}
//}
