package Relativelocators;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokingmultiplewindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\trani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parentwindow= it.next();
		String childwindow= it.next();
		driver.switchTo().window(childwindow);
		driver.get("https://www.rahulshettyacademy.com");
		String coursename= driver.findElement(By.xpath("//div[@class='upper-box']/h2/a[@href='https://courses.rahulshettyacademy.com/p/get-access-to-all-courses']")).getText();
		driver.switchTo().window(parentwindow);
		WebElement name= driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(coursename);
		
		//File file= name.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("logo.png"));
		
	//get height and width 
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		
		
	
	}

}
