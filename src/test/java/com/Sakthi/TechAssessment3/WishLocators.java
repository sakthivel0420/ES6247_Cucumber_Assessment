package com.Sakthi.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishLocators {
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")
	public WebElement shoes;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")
	public WebElement product;
	@FindBy(xpath="//*[@id=\"add-to-wishlist-button-5\"]")
	public WebElement add;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]")
	public WebElement wishlist;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/table/tbody/tr/td[4]/a")
	public WebElement check1;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/table/tbody/tr/td[1]/input")
	public WebElement box;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[1]/form/div/div/input[1]")
	public WebElement update;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div")
	public WebElement check2;
	
}
