package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxBrowserHeadless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.Set system property for geckodriver
		System.setProperty("webdriver.geckodriver.driver", "c:\\geckodriver.exe");
	//2.create object of Firefox Options
		
	FirefoxOptions fo = new FirefoxOptions();
	
	//add headless arguments to firefoxoptions
	
	fo.addArguments("__headless");
	
	//3.Instantiate Firefox browser
	
	WebDriver driver = new FirefoxDriver();
	
	
	// open tek school page and print its title 
	driver.get("https://tekschoolofamerica.com/");
	
	
	
	}

}
