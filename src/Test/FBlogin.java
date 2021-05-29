package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBlogin {
	WebDriver driver;
	public static void main(String args[]) throws InterruptedException {
		FBlogin fbLogin=new FBlogin();
		fbLogin.setup();
		fbLogin.login();
		
	}
    public void setup() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver",  "chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    	driver.get("http://www.facebook.com/");
    	Thread.sleep(3000);
    	}
    public void login() throws InterruptedException {
    	WebElement name=driver.findElement(By.xpath("//input[@name='email']"));
    	name.sendKeys("ashwin@gmail.com");
    	WebElement pass=driver.findElement(By.cssSelector("input#pass"));
    	pass.sendKeys("12345");
    	
    	WebElement loginbtn=driver.findElement(By.cssSelector("button[name='login']"));
		loginbtn.click();
    	
    }
 public void createAccount() {
	 WebElement text=driver.findElement(By.xpath("//*[contains(text(),'Facebook']"));
	 text.getText();
	 WebElement create=driver.findElement(By.xpath("//*[text()='Create New Account']"));
	 create.click();
	 WebElement name=driver.findElement(By.xpath("//input[@name='firstname']"));
	 name.sendKeys("Ashwin Prabhu");
	 WebElement Lname=driver.findElement(By.xpath("//input[@name='lastname']"));
	 Lname.sendKeys(" Prabhu");
	 
	 WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	 email.sendKeys("ashwin@gmail.com");
	
	 //dropdown
	 WebElement dropdown=driver.findElement(By.xpath("//*[@title='Day']"));
	 Select day=new Select(dropdown);
	 day.selectByVisibleText("4");
	 
	 WebElement dropMonth=driver.findElement(By.xpath("//*[@title='Year']"));
	 Select year =new Select(dropMonth);
	 year.selectByValue("2000");
   ////// radio button
	 WebElement radio=driver.findElement(By.xpath("//input[@type='radio' and @value='1' ]"));
	 radio.click();
 
 }

 // Tag and ID CSS selector
 //Syntax :”css = tag#id”
 
 // Tag and Class
 // Syntax : “css = tag.class”
 //Tag and Attribute
 // Syntax : “css = tag[attribute=value]”


}

