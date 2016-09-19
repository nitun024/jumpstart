package reusables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RE_SignUp {

	public static WebElement NameTxBx(WebDriver driver) {
		return driver.findElement(By.cssSelector("#SignUpName"));
	}

	public static WebElement EmailTxBx(WebDriver driver) {
		return driver.findElement(By.cssSelector("#SignUpEmail"));
	}

	public static WebElement PwdTxBx(WebDriver driver) {
		return driver.findElement(By.cssSelector("#SignUpPW"));
	}

	public static WebElement CnfrmPwdTxBx(WebDriver driver) {
		return driver.findElement(By.cssSelector("#SignUpPW2"));
	}
	
	public static WebElement SignUpBtn(WebDriver driver) {
		return driver.findElement(By.cssSelector("input[class='buttonWizard gradient']"));
	}

}
