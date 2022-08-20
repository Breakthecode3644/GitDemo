package Actionsection10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Numberoflink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\trani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerpart = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerpart.findElements(By.tagName("a")).size());
		WebElement coloumpart= footerpart.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		System.out.println(coloumpart.findElements(By.tagName("a")).size());
		
		for(int i=1;i<coloumpart.findElements(By.tagName("a")).size();i++)
		{
			String clickinlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumpart.findElements(By.tagName("a")).get(i).sendKeys(clickinlink);
			Thread.sleep(3000);
		}
		Set<String> abc= driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}

}
