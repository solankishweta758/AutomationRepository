package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class isMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://demoapps.qspiders.com/");
	   driver.findElement( By.xpath("//section [text() ='Dropdown']")).click();
	   WebElement dropdown1=driver.findElement(By.xpath("//label[text"));
	   
	   
	}
}
