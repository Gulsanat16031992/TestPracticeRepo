package SeleniumBasics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FFFbrowser {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//0. system property setup
		System.setProperty("webdriver.geckodriver.driver", "c:\\geckodriver.exe");
		
		//1. create object of WebDriver to run Firefox Driver
		WebDriver driver = new ChromeDriver();
		
		//2.  get() method

		driver.get("https://www.google.com/");
		
		// i want to get the title of this page 
		// .getTitle()
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//close browser
		//close()
		driver.close();
		
		
			
		
		
	}

}
