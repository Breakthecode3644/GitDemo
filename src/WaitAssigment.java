import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAssigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\trani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//div[@class='form-check-inline']/label[2]/span[2]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("okayBtn")));
		
		driver.findElement(By.id("okayBtn")).click();
		
		Select role = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		role.selectByVisibleText("Consultant");
		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for(int i =0;i<products.size();i++)

		{

		products.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click();
		}



	}


