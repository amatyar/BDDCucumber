package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSteps {
	@Given("the user is on the dashboard page")
	public void the_user_is_on_the_dashboard_page() {
	   System.out.println("hello");
	}

	@When("the user enters valid dusername and dpassword")
	public void the_user_enters_valid_dusername_and_dpassword() {
	   System.out.println("Hello");
	}

	@When("clicks on the dLogin button")
	public void clicks_on_the_d_login_button() {
	   System.out.println("Hello");
	}

	@Then("the user should be navigated to the dashboard")
	public void the_user_should_be_navigated_to_the_dashboard() {
	   System.out.println("Hello");
	}



}
