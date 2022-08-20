package Actionsection10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\trani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> country= driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		
		for(int i=0;i<country.size();i++)
		{
			String droptext = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div")).get(i).getText();
			if(droptext.equalsIgnoreCase("india"))
			{
				//System.out.println(droptext);
				driver.findElements(By.cssSelector("li[class='ui-menu-item'] div")).get(i).click();
				break;
			}
		}
		
		//System.out.println(driver.findElement(By.cssSelector("#autocomplete")).getText());
		 System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 
	}

}
