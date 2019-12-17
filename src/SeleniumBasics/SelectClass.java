package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//.o Set System property
				//.1 open chrombrowser
				//.2 get test environment url
		 		//.3 find Phone & PDAs element
				//.4 click on it.
		
				System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				
				
				driver.get("https://tekschoolofamerica.com/test-environment/");
				
				WebElement phone_PDAS =driver.findElement(By.xpath("//a[text()='Phones & PDAs']"));
				phone_PDAS.click();
				
				// To handle static dropdowns we use Select class 
				WebElement sortByElement = driver.findElement(By.xpath("//select[@id='input-sort']"));
				
				Select select = new Select(sortByElement);
				
				//select.selectByVisibleText("Price (High > Low)");
				//1. selectbyVlaue
				//select.selectByValue("https://tekschoolofamerica.com/test-environment/index.php?route=product/category&path=24&sort=p.price&order=DESC");
				//2. selectyIndex
				select.selectByIndex(4);

	}

}
