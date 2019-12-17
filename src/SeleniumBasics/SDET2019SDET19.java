package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SDET2019SDET19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://tekschoolofamerica.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//li[@id='menu-item-7965']"));
        driver.findElement(By.xpath("//a[text()='Test Environment']")).click();
    
        Utility.screenshot(driver,"C:\Users\gulya\eclipse-workspace\Selenium\output," "SDET001");
    }

}
