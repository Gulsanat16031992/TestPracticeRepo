package SeleniumBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	

	
 public static void main (String [] args, ChromeDriver WebDriver){
	 
	 
	 // TODO Auto-generated method stub
	 
	 //0. Set system property for browser
	 // Syntax = System.setProperty("webdriver.chrome.driver", "path of chromedriver.exe");
	 System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	 
	 //1. Create Object of WebDriver
	 
	 WebDriver driver = new ChromeDriver();
	 
	 //open google.com
	 
	 //ur = https://www.google.com/
	 
	 //get() method opens browser
	 driver.get("https://www.google.com/");
	 
	 
	}

}
