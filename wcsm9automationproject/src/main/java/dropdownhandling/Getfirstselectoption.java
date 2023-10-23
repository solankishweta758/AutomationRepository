package dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getfirstselectoption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("file:///C:/Users/User/Desktop/htmldocument.html/multi.html");
	   WebElement dropdown1=driver.findElement(By.id("iddd"));
	   //handle the dropdown
	   Select sel=new Select (dropdown1);
	   
	   //select the option from the dropdown
	   Thread.sleep(2000);
	   sel.selectByValue("v7");
	   Thread.sleep(2000);
	   //get option which is selected first
	   WebElement firstopt=sel.getFirstSelectedOption();
	   System.out.println(firstopt.getText());
	   
	   //multiselected dropdown
	   driver.navigate().to("file:///C:/Users/User/Desktop/htmldocument.html/multi.html");
	   WebElement dropdown2=driver.findElement(By.id("iddd"));
	   Select sel2=new Select(dropdown2);
	
	   for(int i=5;i<8;i++)
	   {
		   Thread.sleep(2000);
		  sel2.selectByIndex(i);
		  Thread.sleep(2000);
		  System.out.println(sel2.getFirstSelectedOption().getText());
		  
		  
	   }

	}

}
