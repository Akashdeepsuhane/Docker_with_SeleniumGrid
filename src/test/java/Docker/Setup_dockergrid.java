package Docker;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup_dockergrid {

    @BeforeTest
    void StartDocker_grid() throws IOException, InterruptedException {

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            // Windows: start Docker Grid using bat file
            Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
            Thread.sleep(15000);
        } else {
            // Linux/CI (GitHub Actions): Grid is already started by workflow, just wait
            System.out.println("CI environment detected - Selenium Grid started by workflow, skipping bat file.");
            Thread.sleep(5000);
        }
    }

    @AfterTest
    void StopDocker_grid() throws IOException, InterruptedException {

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            // Windows: stop Docker Grid using bat file
            Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
            Thread.sleep(10000);
            Runtime.getRuntime().exec("taskkill /f /im cmd.exe"); // closes the command prompt
        } else {
            // Linux/CI: Grid will be stopped by workflow
            System.out.println("CI environment detected - Grid will be stopped by workflow.");
        }
    }

}