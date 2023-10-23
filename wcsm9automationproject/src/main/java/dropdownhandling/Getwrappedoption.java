package dropdownhandling;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getwrappedoption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("file:///C:/Users/User/Desktop/htmldocument.html/multi.html");
	   WebElement dropdown1=driver.findElement(By.id("iddd"));
	   Select sel=new Select (dropdown1);
	   WebElement allops=sel.getWrappedElement();
	   System.out.println(allops.getText());
	  List<WebElement> options=sel.getOptions();
	  for(WebElement opt:options)
	  {
		  Thread.sleep(2000);
		  if(opt.getText().equals("Uttapa"))
		  {
			  opt.click();
			  break;
		  }
	  }
	}

}
