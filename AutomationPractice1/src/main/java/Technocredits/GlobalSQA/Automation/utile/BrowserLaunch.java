package Technocredits.GlobalSQA.Automation.utile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 
{
	static WebDriver driver;
    public static WebDriver loadURL(String browser, String URL){
    	if(browser.equalsIgnoreCase("chrome")){
    		System.setProperty("webdriver.chrome.driver", "W:\\Selenium Class Material\\Selenium_Required_Software_Jars\\chromedriver.exe");
    		 driver = new ChromeDriver();	
    	}
		return driver;
}
}