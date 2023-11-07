package com.Sakthi.TechAssessment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	public String url,vaild_email,valid_pass,Invalid_email,Invalid_pass;
	public Utility(){
		data();
	}
	public void data() {
		File file = new File("C:\\Users\\ssenthilvel\\CucumberAssessment\\Sakthi.TechAssessment3\\src\\test\\resources\\Features\\data.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		url = prop.getProperty("url");
		vaild_email = prop.getProperty("vaild_email");
		valid_pass = prop.getProperty("valid_pass");
		Invalid_email = prop.getProperty("Invalid_email");
		Invalid_pass = prop.getProperty("Invalid_pass");
		
		
}

}
