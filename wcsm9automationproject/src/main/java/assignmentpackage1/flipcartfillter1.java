package assignmentpackage1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartfillter1 {
   public static void main(String[] args) throws InterruptedException 
   {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		//handle the pop up
		driver.findElement(By.xpath("//span[text()"));
	    driver.findElement(By.name("q")).sendkeys("laptop");
		
	    driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']"));
	