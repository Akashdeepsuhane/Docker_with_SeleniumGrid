package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

//How to pull the image from Docker hub
//How to create container
//Create and run Selenium tests remotely on Container

public class Chrome_Test1 {

	@Test
	public void Docker_with_Chrome() throws MalformedURLException{	
		
		
	  DesiredCapabilities dc = new DesiredCapabilities();
	  
	  ChromeOptions ch = new ChromeOptions();
	  
	     dc.setBrowserName("chrome");
	//  dc.setBrowserName("firefox");
	  
	
	
	  URL url = new URL("http://localhost:4444/wd/hub");
	 // URL url = new URL("http://3.110.131.214:4444");
	  
	  RemoteWebDriver driver = new RemoteWebDriver(url,dc);
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  System.out.println("title of the Page is:"+ driver.getTitle());
	  driver.quit();
		
		

	}

}
