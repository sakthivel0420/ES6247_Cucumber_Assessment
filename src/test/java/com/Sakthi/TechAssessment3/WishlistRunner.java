package com.Sakthi.TechAssessment3;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ssenthilvel\\CucumberAssessment\\Sakthi.TechAssessment3\\src\\test\\resources\\Features\\Wishlist.feature",glue="com.Sakthi.TechAssessment3",
plugin={"pretty","junit:target/Cucumber-reports/Cucumber.junit"})
public class WishlistRunner {

}
