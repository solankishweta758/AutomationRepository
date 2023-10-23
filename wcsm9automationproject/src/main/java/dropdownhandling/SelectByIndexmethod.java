package dropdownhandling;
import org.openqa.selenium.By;

	import java.time.Duration;
	import java.util.Set;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class SelectByIndexmethod {
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver	driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://demoapps.qspiders.com/");
			//driver.findElement(By.xpath("//selection[text()='Dropdown']").click();
			driver.findElement(By.xpath("//section[text()='Dropdown']")).click();

			//identify ph no.
			WebElement Dropdown1=driver.findElement(By.xpath("//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring  ease-linear transition-all duration-150 w-5/12']"));
            Select sel=new Select(Dropdown1);  
            sel.selectByIndex(2);
            //Thread.sleep(2000);
            //WebElement dropdown2=driver.findElement(By.xpath("//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150']"));
            WebElement Dropdown2=driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
            Select sel2=new Select(Dropdown2);
            sel2.selectByValue("India");
            
            //identify select state dropdown
            driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
            WebElement Dropdown3=driver.findElement(By.partialLinkText('MultiSelect')).click();
            WebElement Dropdown3=driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select\"));
            Select sel3=new select(Dropdown3);
            
            for(int i=0;i<=5;i++);
            {
            	sel3.deselectByIndex(i);
            }
            
		}
	}
	