// Created by Nitun on 9/18/2016.

package testcases;

import java.io.IOException;

import org.apache.regexp.RE;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import reusables.RE_Login;
import reusables.RE_Website;
import actions.Todo;

import java.util.concurrent.TimeUnit;

public class Login {

	@Test
	public void login() throws InterruptedException, IOException {

		System.setProperty(
				"webdriver.chrome.driver",
				"C:\\Users\\Admin\\workspace\\Jumpstart\\JarFiles\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www2.staticso2.com");

		System.out.println("The title of the page is :   "+ Todo.getTitle(driver));
		
		Boolean bl = Todo.getTitle(driver).equalsIgnoreCase(RE_Website.Website_Title);
		
		if (bl == true)
			System.out.println("The page is correct.");
		else
			System.out.println("Incorrect page has been opened.");
		
		//Thread.sleep(20000);
		
		RE_Website.SignInBtn(driver).click();
		
		
		RE_Login.EmailTxBx(driver).sendKeys("testnitun1@gmail.com");
		RE_Login.PwdTxBx(driver).sendKeys("test");
		RE_Login.SignInBtn(driver).click();
		
		
	

	}

}