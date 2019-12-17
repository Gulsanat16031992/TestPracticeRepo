package SeleniumBasics;

System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
​
driver.get("https://www.aa.com/homePage.do");
​
// 1. grab the departure box xpath
// 2. Store in a WebElment object
// 3. Clear the box
// 4. send (Wash) value
// 5. create a list for storing webElments of dropdowns
// 6. Create a for each loop to travel to list indexes
// 7. write an if condition to click or select value we want
// 8. break from the loop
// WebElement departure = driver.findElement(By.xpath(
// "//input[@class='aaAutoComplete ui-autocomplete-input' and
// @id='reservationFlightSearchForm.originAirport']"));
​
// departure with css selector
​
// using Action class move to departure Element
Actions actions = new Actions(driver);

​
WebElement reqLink = driver
		.findElement(By.xpath("//*[@id=\"reservationFlightSearchForm\"]/div[5]/div[1]/div/p[3]/a"));
actions.moveToElement(reqLink).build().perform();
​
WebElement departure = driver
		.findElement(By.cssSelector("input[id='reservationFlightSearchForm.originAirport']"));
departure.clear();
departure.sendKeys("Wash");
​
List<WebElement> airports = driver.findElements(By.xpath("//ul[@id='ui-id-3']/li"));
​
System.out.println(airports.size());
​
for (WebElement element : airports) {
​
	try {
		if (element.getText().contains("BWI"))
			element.click();
		break;
	} catch (StaleElementReferenceException e) {
​
		System.out.println("Element is no loger attached to dom");
	}
}
​

​
// arrival dropdown
WebElement arrival = driver
		.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
arrival.clear();
arrival.sendKeys("las");
​
List<WebElement> arrivalairports = driver.findElements(By.xpath("//ul[@id='ui-id-4']/li"));
System.out.println(arrivalairports.size());
​
for (WebElement arrivalElments : arrivalairports) {
​
	try {
		if (arrivalElments.getText().contains("LAS"))
			arrivalElments.click();
		break;
	} catch (StaleElementReferenceException e) {
		System.out.println("Element is no loger attached to dom");
	}
​
}


// select object to select values from static dropdown
WebElement numberOfPassengers = driver.findElement(By.cssSelector("select[id='flightSearchForm.adultOrSeniorPassengerCount']"));
Select select = new Select(numberOfPassengers);
select.selectByVisibleText("9");


// Storing departure date in a webelement obj
WebElement departureCalendar = driver.findElement(By.xpath("//input[@id='aa-leavingOn']"));
//selecting desire date using JSExecutor class
Utility.selectDateByJS(driver, departureCalendar, "11/21/2019");

WebElement returnCalendar = driver.findElement(By.xpath("//input[@id='aa-returningFrom']"));
Utility.selectDateByJS(driver, returnCalendar, "11/30/2019");

Collapse








j

















