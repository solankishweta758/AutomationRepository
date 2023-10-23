package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionMethod  {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		driver.findElement(By.xpath("//label[text()='Country']")).click();
		WebElement phdd1 = driver.findElement(By.xpath("//label[text()='Select Country']/following-sibling::select"));
 
		Select sel1 = new Select(phdd1);
		List<WebElement> allops = sel1.getOptions();
		
		for(int i=0; i<allops.size(); i++)
		{
			String opt = allops.get(i).getText();
			Thread.sleep(2000);
            System.out.println(opt);
            
		}
		//we read list by using foreach loop
		/*for(WebElement opt : allops ) 
		  {
		  System.out.println(opt);

		  }
		*/
		
		}

}