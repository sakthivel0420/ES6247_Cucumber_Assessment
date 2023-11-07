package com.Sakthi.TechAssessment3;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishlistDefinition {
	WishActions actions=new WishActions();
	Utility utility=new Utility();
	@Given("user is in the home page")
	public void user_is_in_the_home_page() {
	    Helper.openPage(utility.url);
	    Helper.log.info("entered home page");
	}

	@Given("user clicks on apparels and shoes")
	public void user_clicks_on_apparels_and_shoes() {
	   actions.clickshoe();
	   Helper.log.info("clicked on shoes");
	   
	}

	@Given("user clicks  on one item")
	public void user_clicks_on_one_item() {
	    actions.clickproduct();
	    Helper.log.info("clicked one the first item");
	}

	@Given("User clicks on add to wishlist")
	public void user_clicks_on_add_to_wishlist() {
		actions.add();
		Helper.log.info("clicked add to wish list");
	}

	@Given("User clicks on Wishlist")
	public void user_clicks_on_wishlist() {
		actions.wishlist1();
		Helper.log.info("click wishlist");
	}

	@Then("The item is shown on the wishlist")
	public void the_item_is_shown_on_the_wishlist() {
		Assert.assertTrue(actions.getVerifyText().contains("50's Rockabilly Polka Dot Top JR Plus Size"));
		System.out.println("sucessfully added");
		Helper.log.info("item is added to wishlist");
	}

	

	@When("the remove option is clicked")
	public void the_remove_option_is_clicked() {
	   actions.box();
	   Helper.log.info("the remove checkbox is clicked ");
	}

	@When("the update wish list is clicked")
	public void the_update_wish_list_is_clicked() {
	    actions.update();
	    Helper.log.info("the update wish list is clicked");
	}

	@Then("the wishlist is empty message is shown")
	public void the_wishlist_is_empty_message_is_shown() {
		Assert.assertTrue(actions.getVerifyText1().contains("The wishlist is empty!"));
		System.out.println("sucessfully removed");
		Helper.log.info("the wishlist is empty message is shown");
	}


}
