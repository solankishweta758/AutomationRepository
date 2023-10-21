package airvistara;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
				co.addArguments
				("--disable-notification");
			
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-direct?gclid=CjwKCAjwgsqoBhBNEiwAwe5w073vxyQYtQ2LYPjofjSHCTRXACJEZCU3xeOjwqSlaGb4eYx6vbvEJBoCyzcQAvD_BwE&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=CjwKCAjwgsqoBhBNEiwAwe5w073vxyQYtQ2LYPjofjSHCTRXACJEZCU3xeOjwqSlaGb4eYx6vbvEJBoCyzcQAvD_BwE:G:s&s_kwcid=AL!596!3!659805002549!p!!g!!vistara%2520airlines&s_kwcid=AL!596!3!659805002549!p!!g!!vistara+airlines&gad=1");
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("flightSearchFrom")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.name("flightSearchTo")).sendKeys("mumbai");
		Thread.sleep(2000);
		driver.findElement(By.id("departCalendar")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[data-date='27']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[data-date='29']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("passengers")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[value='business']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*=' passengerModalBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("book-flight-widget")).click();
		Thread.sleep(2000);
	}

}
