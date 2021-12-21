package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger log = null;
	
	
	
	
	public BaseClass() {
		log= Logger.getLogger("rootLogger");
		PropertyConfigurator.configure(".\\src\\main\\java\\logReporting\\log4j.properties");		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + ".\\src\\main\\java\\com\\qa\\configfile\\config.properties");
			prop.load(ip);
			log.info("Properties file initialised");
			
		} 
	
			
		catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
	

}
