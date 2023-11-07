package com.Sakthi.TechAssessment3;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginDefinition {
	LoginActions actions=new LoginActions();
	Utility utility=new Utility();
	 
	@Given("User is in the home page.")
	public void user_is_in_the_home_page() {
	    Helper.openPage(utility.url);
	    Helper.log.info("User is in the home page.");
	}
	@Given("User clicks the log in button")
	public void user_clicks_the_log_in_button() {
		actions.clicklog();
		Helper.log.info("User clicks the log in button");
	    
	}

	@Given("User gives valid email")
	public void user_gives_valid_email() {
		actions.setemail(utility.vaild_email);
		Helper.log.info("User gives valid email");
	}

	@Given("User gives valid password")
	public void user_gives_valid_password() {
		actions.setpass(utility.valid_pass);
		Helper.log.info("User gives valid password");
	}

	@Given("User clicks the login button")
	public void user_clicks_the_login_button() {
		actions.login();
		Helper.log.info("User clicks the login button");
	}

	@Then("User is shown looged in to the website")
	public void user_is_shown_looged_in_to_the_website() {
		Assert.assertTrue(actions.getVerifyText().contains("Welcome to our store"));
		System.out.println("sucessful");
		Helper.log.info("User is shown looged in to the website");
	}

	@Given("User gives Invalid email")
	public void user_gives_invalid_email() {
		actions.setemail(utility.Invalid_pass);
		Helper.log.info("User gives Invalid email");
	}

	@Given("User gives Invalid password")
	public void user_gives_invalid_password() {
		actions.setemail(utility.Invalid_email);
		Helper.log.info("User gives Invalid password");
	}

	@Then("User is shown No customer account found message")
	public void user_is_shown_no_customer_account_found_message() {
		Assert.assertTrue(actions.getVerifyText().contains("Please enter a valid email address."));
		System.out.println("unsucessful");
		Helper.log.info("User is shown No customer account found message");
	}

}
