package MethodsOfWebDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart1 {
   public static void main(String[] args) throws InterruptedException 
   {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		//handle the pop up
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		driver.findElement(By.name("q")).sendKeys("Laptop",Keys.ENTER);
		//driver.findElement(By.xpath("//span[text()"));
	    
		//Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao']")).click();
		
	   driver.findElement(By.xpath("//div[text()='Brand']"));
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[@text()='HP']")).click();
	   
	   
	   driver.findElement(By.xpath("//div[text()='Processor']"));
	   driver.findElement(By.xpath("//div[text()='Core i7']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[text()='Operating System']"));
	   Thread.sleep(2000);
	   
	   
	  // driver.findElement(By.xpath(null))
   }
}