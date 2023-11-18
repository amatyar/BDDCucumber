package StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Multiuser {

	 WebDriver driver;
	 @Given("the user is on the Saucedemo login page")
	 public void the_user_is_on_the_saucedemo_login_page() {
	     // Write code here that turns the phrase above into concrete actions
	    driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/v1/");
	 }

	 @When("the user enters {string} and {string}")
	 public void the_user_enters_and(String username, String password) {
	     // Write code here that turns the phrase above into concrete actions
	   WebElement userNameField = driver.findElement(By.id("user-name"));
	   WebElement passwordField = driver.findElement(By.id("password"));
	   userNameField.sendKeys(username);
	   passwordField.sendKeys(password);
	 }
	 @When("the clicks on the Login button")
	 public void clicks_on_the_login_button() {
	     // Write code here that turns the phrase above into concrete actions 
	  WebElement loginButton = driver.findElement(By.id("login-button"));
	  loginButton.click();
	  
	 }	     
	 
	 @Then("the user should be {string}")
	 public void the_user_should_be(String login_status) {
	    if(login_status.equals("successful")) {
	    WebElement product = driver.findElement(By.cssSelector(".product_label"));
	     assertEquals("Products",product.getText());
	    }
	    else {
	   WebElement errorElement =  driver.findElement(By.cssSelector("#login_button_container > div > form > h3"));
	  assertEquals("Epic sadface: Sorry, this user has been locked out." ,errorElement.getText());
	    }
	    
	  driver.quit();
	 }
}
