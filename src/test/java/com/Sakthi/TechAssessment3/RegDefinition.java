package com.Sakthi.TechAssessment3;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegDefinition {
	RegActions actions=new RegActions();
	Utility utility=new Utility();
	
	@Given("User is in the home page")
	public void user_is_in_the_home_page() {
	    Helper.openPage(utility.url);
	    Helper.log.info("page opened");
	}

	@When("User clicks the register button")
	public void user_clicks_the_register_button() {
	    actions.clickreg();
	    Helper.log.info("register page opened");
	}

	@When("User selects a gender")
	public void user_selects_a_gender() {
	actions.gender();
	Helper.log.info("gender selected");
	}

	@When("User provides valid credentials")
	public void user_provides_valid_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException{
		Helper.log.info("cred entered");
		List<Map<String,String>> signupForm =dataTable.asMaps(String.class,String.class);
		for(Map<String,String>form:signupForm) {
			String firstname =form.get("firstname");
			actions.setFirstname(firstname);
			Helper.log.info("entering first name");
			
			String lastname =form.get("lastname");
			actions.setlastname(lastname);
			Helper.log.info("entering last name");
			
			String email =form.get("email");
			actions.setemail(email);
			Helper.log.info("entering email");
			
			String password =form.get("password");
			actions.setpassword(password);
			Helper.log.info("entering password");
			
			String conpassword =form.get("conpassword");
			actions.setconpassword(conpassword);
			Helper.log.info("entering confirm password");
					
		}
	   
	}

	

	@When("User clicks Register")
	public void user_clicks_register() {
	actions.reg_button();
	Helper.log.info("register button is clicked");
	}
	

	@Then("The User is shown Your registration completed message")
	public void the_user_is_shown_your_registration_completed_message() {
		Assert.assertTrue(actions.getVerifyText().contains("Your registration completed"));
	Helper.log.info("sucessful");
	}







}