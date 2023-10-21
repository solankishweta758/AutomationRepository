package assignment02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTC2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver	driver=new ChromeDriver(co);	
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
	    Thread.sleep(2000);
	
		driver.findElement(By.xpath("//button[@id='cookieModalCloseBtn']")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")).sendKeys("Mumbai");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[class='ng-tns-c65-11 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']")).click();
		Thread.sleep(2000);
		
		/*driver.findElement(By.xpath("//a[text()='26']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='29']")).click();
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//input[@id='passengers']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='pre_btn']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Search Flights']")).click();
		Thread.sleep(3000);
		
		driver.quit();      */  
	}

}