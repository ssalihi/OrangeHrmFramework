package com.orangehrm.utils;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseClass {
	public static WebDriver driver;
	
	
	
	
	
	public static void setUpDriver() {
		ConfigsReader.readProperties(Constant.CREDENTIALS_FILEPATH);// we simply reading our properties in this line ("src/test/resources/configs/credentials.properties")
		String browser1=ConfigsReader.getProperty("browser");// Getting to browser in line
		if(browser1.equalsIgnoreCase("chrome")) {
			
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Sekander Salihi/Selenium/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers./chromedriver.exe");
		 driver=new ChromeDriver();
		}else if (browser1.equalsIgnoreCase("firefox")) {
		//System.setProperty("webdriver.gecko.driver", "C:/Users/Sekander Salihi/Selenium/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");//...1
		 driver=new FirefoxDriver();//...2
		} else if (browser1.equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriver.exe");
		driver=new InternetExplorerDriver();
		
		}else {
			System.out.println("Given brower in wrong");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().fullscreen();
		driver.get(ConfigsReader.getProperty("url"));
	driver.manage().window().maximize();

	}
	
	public static void tearDown() {
		driver.quit();
	}
	
	
}
