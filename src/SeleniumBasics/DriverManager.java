package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static void main(String[] args) {

        
        //1. Create object    of webDriver
        WebDriver driver = new ChromeDriver();
                
        //2. launch browser
        
        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();
       driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

       //3. get face title
       String actualTitle = driver.getTitle();
       String expectedTitle = "Facebook - Log In or Sign Up";

       if(actualTitle.equals(expectedTitle)){
           System.out.println("Title is correct");
       }else{
           System.out.println("Wrong title");
        }

       //4. store title in string name actualTitle
       driver.findElement(By.id("email")).sendKeys("test@test.com");
       driver.findElement(By.id("pass")).sendKeys("123");
	    driver.findElements(By.id("email")).clear();
	    
	    
	    //clearing password field
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("pass")).sendKeys("123");
	    driver.findElements(By.id("email")).clear();
	    driver.findElements(By.id("u_0_2")).get(0).click();
	    
	    
	    
		
	}

}
