package com.Sakthi.TechAssessment3;

import org.openqa.selenium.support.PageFactory;

public class RegActions {
	RegLocators RegLocators=null;
	
	
	public RegActions() {
		RegLocators = new RegLocators();
		PageFactory.initElements(Helper.getDriver(),RegLocators);
	}
	public void clickreg() {
		RegLocators.reg.click();
	}public void gender() {
		RegLocators.gender.click();
	}
	public void setlastname(String lastname) {
		RegLocators.lastname.sendKeys(lastname);
	}
	public void setemail(String email) {
		RegLocators.email.sendKeys(email);
	}
	public void setpassword(String password) {
		RegLocators.password.sendKeys(password);
	}
	public void setconpassword(String conpassword) {
		RegLocators.conpassword.sendKeys(conpassword);
	}
	public void setFirstname(String Firstname) {
		RegLocators.firstname.sendKeys(Firstname);
	}
	public void reg_button() {
		RegLocators.regbutton.click();
	}
	public String getVerifyText() {
		return RegLocators.check.getText();
	}



}
