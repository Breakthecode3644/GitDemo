import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browseropening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\trani\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=OrR3GDEh-LY&ab_channel=ShaktiRathod");
		driver.quit();
		
		ArrayList<String> a = new ArrayList<String>(); 
		a.add("Tranik");
		a.add("Poonam");
		
		System.out.println(a.get(1));
		
		driver.quit();
	}

}
