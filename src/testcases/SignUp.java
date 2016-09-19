package testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.RandomDataGenerator;
import reusables.RE_SignUp;

public class SignUp {

	@Test
	public void signUp() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Jumpstart\\JarFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://app2.staticso2.com/signup.aspx");
		
		// start
		
		RE_SignUp.NameTxBx(driver).sendKeys("testdragon2");
		
		String testEmail = RandomDataGenerator.randomEmail("so", "jumpstart");
		RE_SignUp.EmailTxBx(driver).sendKeys(testEmail);
		
		RE_SignUp.PwdTxBx(driver).sendKeys("test");
		RE_SignUp.CnfrmPwdTxBx(driver).sendKeys("test");
		RE_SignUp.SignUpBtn(driver).click();
		
		System.out.println("Success !!");
	}
}
