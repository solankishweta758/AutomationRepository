package MethodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
	
		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(2000);
		List<WebElement> bikeOptions=driver.findElements(By.xpath("//div[@clss='wM6W7d']"));
		for(WebElement op:bikeOptions)
		{
			String options=op.getText();
			Thread.sleep(2000);
			System.out.println(option);
		}
	}

}
