

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;







import org.openqa.selenium.Keys;







import org.openqa.selenium.WebDriver;







import org.openqa.selenium.WebElement;







import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;







public class waitAssigment2 {


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\trani\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exec");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(2000));

		String[] itemsr = {"iphone","Samsung","Nokia","Blackberry"};

		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("learning");

		driver.findElement(By.cssSelector("input[value='user']")).click();

		int j = 0;

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id='okayBtn']")));

		driver.findElement(By.cssSelector("button[id='okayBtn']")).click();

		//driver.switchTo().alert().accept();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@data-style='btn-info']")));

		WebElement option = driver.findElement(By.xpath("//select[@data-style='btn-info']"));

		Select a = new Select(option);

		a.selectByIndex(2);

		driver.findElement(By.cssSelector("input[type='checkbox']")).click();

		driver.findElement(By.cssSelector("input[id='signInBtn']")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='card h-100']")));

		List<WebElement> list = driver.findElements(By.cssSelector("div[class='card h-100']"));

		for(int i=0;i<list.size();i++)

		{

		List<String> itemsNeeded =Arrays.asList(itemsr);

		String[] name=list.get(i).getText().split(" ");

		String name1 = name[0].trim();

		if(itemsNeeded.contains(name1))

		{

		j++;

		driver.findElements(By.cssSelector("button[class='btn btn-info']")).get(i).click();

		if(j==itemsr.length)

		{

		break;

		}

		}

		}

		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));



		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));



		for(int i =0;i<products.size();i++)



		{



		products.get(i).click();



		}



		driver.findElement(By.partialLinkText("Checkout")).click();}


	
	}










