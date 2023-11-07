package com.Sakthi.TechAssessment3;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@ValidCredentials or @InValidCredentials",features="C:\\Users\\ssenthilvel\\CucumberAssessment\\Sakthi.TechAssessment3\\src\\test\\resources\\Features\\ Login.feature",glue="com.Sakthi.TechAssessment3"
,plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Loginrunner {

}
