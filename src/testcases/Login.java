// Created by Nitun on 9/18/2016.

package testcases;

import java.io.IOException;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import actions.Todo;
import java.util.concurrent.TimeUnit;

public class Login {

	@Test
	public void login() throws InterruptedException, IOException {

		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\Admin\\workspace\\Jumpstart\\JarFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://www.scheduleonce.com");
		
		System.out.println("The title of the page is :   "+ Todo.getTitle(driver));

	}

}