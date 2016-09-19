// Created by Nitun on 9/18/2016.
	 
package reusables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RE_Website {
	
	public static String Website_Title = "Online meeting and appointment scheduling software";

	        public static WebElement SignInBtn(WebDriver driver) {
	        	
	        	driver.switchTo().frame("signinframe");
	        return driver.findElement(By.linkText("Sign in"));
	        }

	    


	}


