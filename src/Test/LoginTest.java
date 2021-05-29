package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
@Listeners(TestNg.class)
public class LoginTest {
	WebDriver driver;
	

	
		@BeforeMethod
		public void setup() throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver",  "chromedriver.exe");
	 driver= new ChromeDriver();
	
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	driver.get("https://simplilearn.com/");
	Thread.sleep(2000);

	
		}
		@Test
		@Parameters({"username","pwd"})
		
		public void login(String Userval,String passwordval){
			
			WebElement loginlink =driver .findElement(By.linkText("Log in"));
			loginlink.click();

			WebElement uname=driver.findElement(By.name("user_login"));
			uname.sendKeys(Userval);
		
			WebElement password=driver.findElement(By.name("user_pwd"));
			password.sendKeys(passwordval);


			WebElement loginbtn=driver.findElement(By.name("btn_login"));
			loginbtn.click();
		
		}
	
	}


