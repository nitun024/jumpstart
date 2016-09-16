package pack1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("http://www.scheduleonce.com");
	
	}
}
