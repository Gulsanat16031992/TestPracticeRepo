package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsandWindowHandling {

    public static void main(String[] args) {


         System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().deleteAllCookies();

          //button[@class='btn btn-primary btn-lg btn-block btn-booking']
            
            // navigate to website
            driver.get("https://ksrtc.in/oprs-web/");
            
            WebElement searchButton = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']\r\n"));
            
            searchButton.click();
            // to handle window popUps we will use switch method
            System.out.println(driver.switchTo().alert().getText());
            driver.switchTo().alert().accept();
            
            // switch from parent webpage to child
            // get title of page
            System.out.println(driver.getTitle());
            
            WebElement crm = driver.findElement(By.xpath("//p[text()='CRM']"));
            crm.click();
            
            //in order to switch from parent window to chilf window we need to do below actions
            // 1. get all window handlers and store in a SET
            Set<String> WindowHandles = driver.getWindowHandles();
            //2. use iterator to iterate in window Handlers SET
            Iterator<String> it=WindowHandles.iterator();
            //3. store parent window handler in a string
            String parentWindow = it.next();
            //4. store child window handler in a string
            String childWindow = it.next();
            //5. use switchTo.Window method for switching from parent to child
            driver.switchTo().window(childWindow);
            
            
            System.out.println(driver.getTitle());
            
            try {
            Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            driver.close();
            driver.switchTo().window(parentWindow);
            System.out.println(driver.getTitle());
                            
                
        
    }

}
