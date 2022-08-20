package Actionsection10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class assingment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\trani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String text1= driver.findElement(By.xpath("//fieldset/label[@for='benz']")).getText();
		System.out.println(text1);
		Select dp= new Select(driver.findElement(By.id("dropdown-class-example")));
		dp.selectByVisibleText(text1);
		driver.findElement(By.id("name")).sendKeys(text1);
		driver.findElement(By.id("alertbtn")).click();
		
		String alerttext= driver.switchTo().alert().getText();
		System.out.println(alerttext);
		String alertstring=alerttext.split(",")[0].trim().split(" ")[1];
		System.out.println(alertstring);
		
		driver.switchTo().alert().accept();
		Assert.assertEquals(text1, alertstring);
		
		

	}

}
