package Actionsection10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigentment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\trani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//System.out.println(driver
				//.findElements(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr")).size());
		//System.out.println(
				//driver.findElements(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr[1]/th"))
						//.size());
		// div[@class='left-align']/fieldset/table[@id='product']/tbody/tr[3]
		//System.out.println(
				//driver.findElement(By.xpath("//div[@class='left-align']/fieldset/table[@id='product']/tbody/tr[3]"))
						//.getText());

		WebElement table = driver.findElement(By.id("product"));

		System.out.println(table.findElements(By.tagName("tr")).size());

		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

		List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		System.out.println(secondrow.get(0).getText());

		System.out.println(secondrow.get(1).getText());

		System.out.println(secondrow.get(2).getText());
	}

}
