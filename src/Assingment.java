import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\trani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group']/input[@name='name']")).sendKeys("Tranik");
		driver.findElement(By.xpath("//div[@class='form-group']/input[@name='email']")).sendKeys("tranikbisen@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		driver.findElement(By.id("exampleCheck1")).click();
		//select[@class='form-control']/option[1]
		//driver.findElement(By.xpath("//select[@class='form-control']/option[2]")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

		Select abc = new Select(dropdown);

		abc.selectByVisibleText("Female");
		//input[@class='form-check-input'][@id='inlineRadio1']
		driver.findElement(By.xpath("//input[@class='form-check-input'][@id='inlineRadio1']")).click();
		driver.findElement(By.cssSelector("input[class='form-control'][name='bday']")).click();
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
	}

}
