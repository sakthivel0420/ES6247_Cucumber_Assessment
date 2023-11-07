package com.Sakthi.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegLocators {
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	public WebElement reg;
	@FindBy(xpath="//*[@id=\"gender-male\"]")
	public WebElement gender;
	@FindBy(xpath="//*[@id=\"FirstName\"]")
	public WebElement firstname;
	@FindBy(xpath="//*[@id=\"LastName\"]")
	public WebElement lastname;
	@FindBy(xpath="//*[@id=\"Email\"]")
	public WebElement email;
	@FindBy(xpath="//*[@id=\"Password\"]")
	public WebElement password;
	@FindBy(xpath="//*[@id=\"ConfirmPassword\"]")
	public WebElement conpassword;
	@FindBy(xpath="//*[@id=\"register-button\"]")
	public WebElement regbutton;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")
	public WebElement check;
	


}
