package reusables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RE_Login {

	public String Website_title = "ScheduleOnce";

	public static WebElement EmailTxBx(WebDriver driver) {
		return driver.findElement(By.id("SignInEmail"));
	}

	public static WebElement PwdTxBx(WebDriver driver) {
		return driver.findElement(By.id("SignInPW"));
	}

	public static WebElement SignInBtn(WebDriver driver) {
		return driver.findElement(By.cssSelector("div[class='buttonWizard gradient']/input"));
	}

	public static WebElement FrgtPwd(WebDriver driver) {
		return driver.findElement(By.linkText("Forgot your password?"));
	}

}
