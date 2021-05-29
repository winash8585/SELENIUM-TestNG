package Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(2000);
        TakesScreenshot obj=(TakesScreenshot)driver;
        File image=obj.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(image, new File("test.png"));
        
        
        
	}

}
