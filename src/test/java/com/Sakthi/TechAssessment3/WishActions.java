package com.Sakthi.TechAssessment3;

import org.openqa.selenium.support.PageFactory;

public class WishActions {
	WishLocators WishLocators=null;
	
	
	public WishActions() {
		WishLocators = new WishLocators();
		PageFactory.initElements(Helper.getDriver(),WishLocators);
	}
	public void clickshoe() {
		WishLocators.shoes.click();
	}public void clickproduct() {
		WishLocators.product.click();
	}public void add() {
		WishLocators.add.click();
	}public void wishlist1() {
		WishLocators.wishlist.click();
	}public void box() {
		WishLocators.box.click();
	}public void update() {
		WishLocators.update.click();
	}public String getVerifyText() {
		return WishLocators.check1.getText();
	}public String getVerifyText1() {
		return WishLocators.check2.getText();
	}
	
}
