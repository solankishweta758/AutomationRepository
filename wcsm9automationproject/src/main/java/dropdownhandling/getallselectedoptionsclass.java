package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getallselectedoptionsclass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("url demo");
	   /*driver.findElement( By.xpath("//section [text() ='Dropdown']")).click();
	   driver.findElement(By.partialLinkText("Multi Select")).click();
	   driver.findElement(By.xpath("//label[text()='City'/following-sibling::select"));	*/
		
	
         WebElement menudropdown=driver.findElement(By.id("iddd"));
         Select sel=new Select (menudropdown);
         
         //select multioption
         for(int i=0;i<4;i++)
         {
        	 Thread.sleep(2000);
        	 sel.selectByIndex(i);
         }
         
         //read only selected options menu drop down
         List<WebElement> allopts=sel.getAllSelectedOptions();
        /*for(int i=0;i<allopts.size();i++)
         {
        	 String op=allopts.get(i).getText();
        	 Thread.sleep(2000);
        	 System.out.println(op);
         }*/
         
         //read the list by using for each loop
         for(WebElement opt:allopts)
         {
        	 String op =opt.getText();
        	 Thread.sleep(2000);
        	 System.out.println(op);
         }
	}

}
