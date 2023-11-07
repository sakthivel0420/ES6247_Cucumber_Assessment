package com.Sakthi.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	public WebElement log;
	@FindBy(xpath="//*[@id=\"Email\"]")
	public WebElement email;
	@FindBy(xpath="//*[@id=\"Password\"]")
	public WebElement pass;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	public WebElement login;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[2]/div[1]/h2")
	public WebElement check;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span")
	public WebElement check1;

}
