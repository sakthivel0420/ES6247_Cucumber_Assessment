package com.Sakthi.TechAssessment3;

import org.openqa.selenium.support.PageFactory;

public class LoginActions {
	LoginLocators LoginLocators=null;
	
	
	public LoginActions() {
		LoginLocators = new LoginLocators();
		PageFactory.initElements(Helper.getDriver(),LoginLocators);
	}
	public void clicklog() {
		LoginLocators.log.click();
	}
	public void setemail(String email) {
		LoginLocators.email.sendKeys(email);
	}
	public void setpass(String pass) {
		LoginLocators.pass.sendKeys(pass);
	}
	public void login() {
		LoginLocators.login.click();
	}
	public String getVerifyText() {
		return LoginLocators.check.getText();
	}public String getVerifyText1() {
		return LoginLocators.check1.getText();
	}
	}
