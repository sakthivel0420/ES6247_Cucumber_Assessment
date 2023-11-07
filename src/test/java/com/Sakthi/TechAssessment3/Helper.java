package com.Sakthi.TechAssessment3;
import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	private static Helper helper;
	private static WebDriver driver;
	private static WebDriverWait wait;
	public static org.apache.logging.log4j.Logger log;

	
	Helper(){
		driver = new EdgeDriver();
		wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		log=LogManager.getLogger(RegDefinition.class);
		log=LogManager.getLogger(LoginDefinition.class);
		log=LogManager.getLogger(WishlistDefinition.class);
	}
	public static void openPage(String url) {
		driver.get(url);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() {
		if(helper==null) {
			helper=new Helper();
		}
	}
//	public static void tearDown() {
//		if(driver!=null) {
//			driver.close();
//			driver.quit();
//		}
//		helper=null;
//	}
}

