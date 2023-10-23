package dropdownhandling;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://demoapps.qspiders.com/");
		//driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		//driver.findElement(By.partialLinkText("Multi Select")).click();
		//WebElement cityDD1 = driver.findElement(By.xpath("//label[text()='city']/following-sibling::section/select"));
		driver.get("file:///C:/Users/User/Desktop/text.html");
		WebElement menudropdown = driver.findElement(By.id("iddd"));
		Select sel = new Select(menudropdown);
		//select multiple options from menu dropdown
		for(int i=0;i<4;i++)
        {
    		sel.selectByIndex(i);
    		

        }
		
		//read only the selected options from menu dropdown
		List<WebElement> allopts = sel.getAllSelectedOptions();
		for(int i=0; i<allopts.size(); i++)
			{
			String opt = allopts.get(i).getText();
			   Thread.sleep(2000);
	           System.out.println(opt);
	            
			}
		


		
	}

}