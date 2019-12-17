package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		//switch to frame
		
				//driver.switchTo().frame("main");
				
				//swith to frame using frame webelement
		
				WebElement headerFrame = driver.findElement(By.xpath("//frame[@name='main']"));
				driver.switchTo().frame(headerFrame);
				WebElement header = driver.findElement(By.xpath("//h2[contains(text(),'Title bar')]"));​
				System.out.println(header.getText());
				
				// switching to default page
				driver.switchTo().defaultContent();
				// please print out text "footer"
				
				driver.switchTo().frame("bot");
				
				WebElement footer = driver.findElement(By.xpath(" //h2[contains(text(),'Footer')]"));
				System.out.println(footer.getText());
				driver.switchTo().defaultContent();
				
				

	}

}
