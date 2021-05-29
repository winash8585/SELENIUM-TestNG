package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		 
		driver.get("http://www.facebook.com/");
	//	Thread.sleep(2000);
//		WebElement loginlink =driver .findElement(By.linkText("Log in"));
//		loginlink.click();
		
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("ashwin527.ap@gmail.com");
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("Apachertr180");
		WebElement loginbtn=driver.findElement(By.name("login"));
		loginbtn.click();


	}

}
