package Actionsection10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\trani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows =driver.getWindowHandles();  //[parentid,childid]
		Iterator<String> it= windows.iterator();
		String parentid= it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/h3/span")).getText());
		driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/h3/span")).getText();
		String user= driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/h3/span")).getText().split("on")[1].split(",")[0].trim();
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(user);
	}

}
