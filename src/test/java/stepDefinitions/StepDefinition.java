package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {

	@Given("^: User is on gmail login page$")
	public void _user_is_on_gmail_login_page() throws Throwable {
		System.out.println("user is on gmail login page");
	}

	@When(": User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("username: " +string + "password: " +string2);
	}

	@Then("^: User navigates to gmail home page$")
	public void _user_navigates_to_gmail_home_page() throws Throwable {
		System.out.println("user is on gmail home page");
	}

	@And("^: User clicks on login button$")
	public void _user_clicks_on_login_button() throws Throwable {
		System.out.println("user clicked login button");
	}

	@And("^: User can see inbox$")
	public void _user_can_see_inbox() throws Throwable {
		System.out.println("user can see inbox emails");
	}

}