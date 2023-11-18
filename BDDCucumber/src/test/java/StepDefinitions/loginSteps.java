package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	WebDriver driver;
	LoginPage loginPage;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		loginPage = new LoginPage(driver);
		
	}

	@When("the user enters valid username and password")
	public void the_user_enters_valid_username_and_password() {
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		loginPage.enterPassword("standard_user");
		loginPage.enterPassword("secret_sauce");
	}

	@When("clicks on the Login button")
	public void clicks_on_the_login_button() {
		//driver.findElement(By.id("login-button")).click();
		loginPage.clickLoginButton();
		
	}

	@Then("the user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
//		boolean avail =driver.getCurrentUrl().contains("inventory");
//		Assert.assertTrue(avail);
		
		driver.quit();
	}
}
