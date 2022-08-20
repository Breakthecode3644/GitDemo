import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addtokart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] veggi = {"Cucumber","Cauliflower","Brocolli","Carrot"};
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\trani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//WebDriverWait w =new WebDriverWait(driver,5);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addtocart(driver,veggi);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//Explicit wait
		//WebDriverWait w = new WebDriverWait(driver,5);
		//WebDriverWait w =new WebDriverWait(driver,5);
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		
		
		}
	public static void addtocart(WebDriver driver,String[] veggi)
	{
		List<WebElement> productname = driver.findElements(By.cssSelector("h4[class='product-name']"));
		int count=0;
		
		for (int i=0;i<productname.size();i++)
		{
			String[] name = productname.get(i).getText().split("-");
			String vegginame=name[0].trim();
			
			
		
		List al= Arrays.asList(veggi);
		
		if(al.contains(vegginame))
		{
			count++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if(count==veggi.length)
				break;
		}
		
		
		}
	}

}
