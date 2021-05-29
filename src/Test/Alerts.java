package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php"); 
        WebElement name= driver.findElement(By.name("cusid"));
        name.sendKeys("Ashwin");
        driver.findElement(By.name("submit")).submit();
        
        Alert obj = driver.switchTo().alert();
        
        
        System.out.println("Eror " + obj.getText());
        
        
        obj.accept();
 


        

	}

}
