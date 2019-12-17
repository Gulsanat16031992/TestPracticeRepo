package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//. browser manage commands:
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// .deleteAllCookies method will delete cookies or data sent from browser.
		driver.manage().deleteAllCookies();
        String baseURL = "https://tekschoolofamerica.com/test-environment/";
        driver.get(baseURL);
        
        // create object of Action class in order to use its methods. 
        
        Actions actions = new Actions(driver);
        
        WebElement component = driver.findElement(By.xpath("//a[text()='Components']"));
        
        //mouse over to an  element
        
        actions.moveToElement(component).build().perform();
        Thread.sleep(3000);
        
        // double click on an element
        
        actions.doubleClick(component).build().perform();
        Thread.sleep(3000);
        
      //right click on web page
        actions.contextClick(component).build().perform();
        
        driver.navigate().to("http://jqueryui.com/resources/demos/droppable/default.html");
        
        //Drag and drop
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        
        actions.dragAndDrop(source, target).build().perform();
        
                
        
        
        
        }

}
