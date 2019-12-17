package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowsers {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare a string and assign an empty value; name of string should be browser
		
		String browser = "IE";
        
        WebDriver driver = null;
		
		switch (browser) {
		case "IE":
			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			break;
		case "FF":
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			 driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			 driver = new ChromeDriver();
			break;
		default:
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			 driver = new ChromeDriver();
			break;
		}
		
		driver.get("https://www.google.com/");

	}
}
