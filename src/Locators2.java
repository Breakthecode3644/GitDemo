import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\trani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\trani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String name="rahul";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Locators2 pass= new Locators2();
		String password=pass.getpassword(driver);
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(name);
		driver.findElement(By.xpath("//form[@class='form']/input[2]")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(1000);
		WebElement str = driver.findElement(By.tagName("p"));
		System.out.println(str.getText());
		Assert.assertEquals(str.getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
		
	}
	
	public String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[2]")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
		String str = driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] line=str.split("'");
		String password= line[1].split("'")[0];
		return password;
	}

}
