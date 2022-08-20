package Actionsection10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class httphandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opions=new ChromeOptions(); 
		opions.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\trani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opions);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
