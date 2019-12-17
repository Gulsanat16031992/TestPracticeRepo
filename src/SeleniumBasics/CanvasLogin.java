package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanvasLogin {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				//. 0 set system property for chromedriver
				// open chrome browser
				// maximize browser
				// set page load for 10 sec
				// set implicite wait for 30 sec
				// go to canvas page 
				// url: https://canvas.instructure.com/login/canvas
				// get title of canvas page \ store in a string and print it.
				// find email element by id enter your email 
				// find pass element by id enter your password
				
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				//.1 instantiate chromeDriver 
				WebDriver driver = new ChromeDriver();
				//. browser manage commands:
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.get("https://canvas.instructure.com/login/canvas");
				
				driver.findElement(By.id("pseudonym_session_unique_id")).sendKeys("test@test.com");
				driver.findElement(By.id("pseudonym_session_password")).sendKeys("test");
				//driver.findElement(By.className("Button Button--login")).click();
				driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button")).click();
		
					
	}

}
