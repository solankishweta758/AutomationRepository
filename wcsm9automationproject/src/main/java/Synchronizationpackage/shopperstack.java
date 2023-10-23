package Synchronizationpackage;

import java.time.duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopperstack 
{
	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver=) new ChromeDriver();	
		
		driver.manage().Timeouts().implicitlywait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		driver.findElements(By.xpath("//img[@alt='APPLE iPhone 14 Pro')")).click();
		driver.findElement(By.id("Check Delivery")).sendkeys("411033");
		WebElement checkButton=driver.findElement()
		
	   
}
