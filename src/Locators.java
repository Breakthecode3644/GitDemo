import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\trani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,Timeout.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//String str;
		//driver.get("https://www.flipkart.com/account/login");
		//driver.findElement(By.cssSelector("input[type='text'][class='_2IX_2- VJZDxU']")).sendKeys("8390233953");
		//driver.findElement(By.cssSelector("input[type='password'][class='_2IX_2- _3mctLh VJZDxU")).sendKeys("3489626258");
		//driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("tranikbisen@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Tranik@1998");
		driver.findElement(By.cssSelector("input[type='text'][placeholder='Phone Number']")).sendKeys("8390233953");
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("rahul");
		driver.findElement(By.xpath("//form[@class='form']/input[2]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		
		
		
	}

}
