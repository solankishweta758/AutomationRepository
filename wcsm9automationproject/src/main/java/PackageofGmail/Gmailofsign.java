package PackageofGmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailofsign {

	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	
		

		driver.manage().window().maximize();
		
		driver get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dgmail%26oq%3Dgmail%26gs_lcrp%3DEgZjaHJvbWUyCwgAEEUYJxg5GIoFMg0IARAAGIMBGLEDGIAEMg0IAhAAGIMBGLEDGIAEMg0IAxAAGIMBGLEDGIAEMgoIBBAAGLEDGIAEMgcIBRAAGIAEMg0IBhAAGIMBGLEDGIAEMgoIBxAAGLEDGIAEMg0ICBAAGIMBGLEDGIAEMgcICRAAGI8C0gEJMTU2NGowajE1qAIAsAIA%26sourceid%3Dchrome%26ie%3DUTF-8&ec=GAlAAQ&hl=en&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S-972234438%3A1697606148321949&theme=glif");
	    driver.findElement(By.xpath(//"div[@text='Email or phone')").clicK();
			// driver.get(By.xpath(//"@texr='solankishweta758@gmail.com')").submit();
				//	 Thread.sleep(2000);
	}

}
