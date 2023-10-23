package dropdownhandling;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//getoption methid
	public class Getoption{

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://demoapps.qspiders.com/");
		   driver.findElement( By.xpath("//section [text() ='Dropdown']")).click();
		   WebElement phnoDropdown1=driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section/select"));
		 
				 //get all   
				   Select sell=new Select(phnoDropdown1);
				   List<WebElement> allOps=sell.getOptions();
		           for(int i=0;i<allOps.size();i++)
		   {
			   String opt=allOps.get(i).getText();
			   Thread.sleep(2000);
			   System.out.println(opt);
		   }
	   }
	}	   
				   
				  
		   
	