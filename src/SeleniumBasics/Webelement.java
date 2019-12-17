package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//. browser manage commands:
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// .deleteAllCookies method will delete cookies or data sent from browser.
		driver.manage().deleteAllCookies();
		
		String url = "https://tekschoolofamerica.com/test-environment/";
		
		driver.get(url);
		String actualTitle = driver.getTitle();
		String expectedTitle = "TEK SCHOOL";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println(actualTitle);
		}else 
			
			System.out.println("Title is not correct");
		
		
		WebElement logo =driver.findElement(By.xpath("//a[text()='TEK SCHOOL']"));
		
		System.out.println(logo.getText());
		System.out.println(logo.isDisplayed());
		
		List <WebElement> links =driver.findElements(By.tagName("a"));
		
		//size of webElement list
		
		System.out.println(links.size());
		
		for (WebElement webLinks: links) {
			String elementText = webLinks.getText();
			System.out.println(elementText);
			
			// if elementText equals to Phones & PDAs then click. 
			if(elementText.equals("Phones & PDAs")) {
				webLinks.click();
				break;
			}
		}
	}
}

