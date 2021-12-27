package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;
import com.qa.commonutils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;
	public static String baseDirectory = System.getProperty("user.dir");
	// public static Logger log;

	public BaseClass() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(Constants.PROP_FILE_PATH);
			prop.load(ip);
			System.out.println("Base Class Created");
			WebDriverManager.chromedriver().setup();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void BrowserInit(String browser, String url) {
		WebDriverManager.chromedriver().setup();
		System.out.println("Browser starts here");
		System.out.println("Browser =" + browser + " & url = " + url );
		driver = new ChromeDriver();
		driver.get(prop.getProperty(url));
	}

}
