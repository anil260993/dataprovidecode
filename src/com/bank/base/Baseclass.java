package com.bank.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.bank.properties.*;

public class Baseclass {
	public static Properties config=new Properties();
	public static Properties OR=new Properties();
	public static FileInputStream fis;
	public static FileInputStream fis2;
	public static WebDriver driver;
	public static Logger log=Logger.getLogger("devpinoyLogger");
	public static  ExcelReader excel=new  ExcelReader(Constant_info.Add_customer_excel_name);
	
	@BeforeSuite
	public void baseTest() throws IOException {
		if(driver==null) {
			
		
		
		if(Constant_info.Browesr.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","/home/vassar/Documents/chromedriver");
	       driver=new ChromeDriver();
	       log.debug("chrome browser launch");
	    
	     
		}
		else if(Constant_info.Browesr.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver","/home/vassar/Documents/geckodriver");
			driver=new FirefoxDriver();
			log.debug("Firefox browser launch");
		}
		
		 driver.manage().timeouts().implicitlyWait(Constant_info.waittime, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get(Constant_info.url);
		 
	}
	
	}
	@AfterSuite
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
		
	}
	
}