package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

//How to pull the image from Docker hub
//How to create container
//Create and run Selenium tests remotely on Container



public class Docker_with_Test2 {

	@Test
	public void Docker_with_Chrome2() throws MalformedURLException{	
		
	  DesiredCapabilities dc = new DesiredCapabilities();
	  
	 dc.setBrowserName("chrome");
	//  dc.setBrowserName("firefox");
	  
	
	
	  
	  URL url = new URL("http://localhost:4444/wd/hub");
	  
	  RemoteWebDriver driver = new RemoteWebDriver(url,dc);
	  
	  driver.get("https://google.com");
	  
	  System.out.println("title of the Page is:"+ driver.getTitle());
	  driver.quit();
		
	}

	}


