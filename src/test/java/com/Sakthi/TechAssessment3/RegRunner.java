package com.Sakthi.TechAssessment3;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ssenthilvel\\CucumberAssessment\\Sakthi.TechAssessment3\\src\\test\\resources\\Features\\Register.feature",glue="com.Sakthi.TechAssessment3",
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RegRunner {

}
