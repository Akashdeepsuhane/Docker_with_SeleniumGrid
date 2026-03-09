package Docker;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Setup_dockergrid {

         @BeforeTest
		void StartDocker_grid() throws IOException, InterruptedException {
			
        	 Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat"); // Opening the command prompt to run bat file.
        	 Thread.sleep(15000);
			
		}
		
	    @AfterTest
        void StopDocker_grid() throws IOException, InterruptedException {
			Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
			
			Thread.sleep(10000);
			
			Runtime.getRuntime().exec("taskkill /f /im cmd.exe");    //closes the command prompt
			
		}
		
		

	}


