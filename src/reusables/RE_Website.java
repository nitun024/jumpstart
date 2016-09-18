// Created by Nitun on 9/18/2016.
	 
package reusables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RE_Website {
	
	
		    //WebDriver driver;

	       //private static WebElement element = null;

	   /* public RE_HomePage(WebDriver driver) {
	        this.driver = driver;
	    }*/

	        public static WebElement getSearchBar(WebDriver driver) {
	        return driver.findElement(By.id("srchBarShwInfo"));
	        }

	    public static WebElement getLoginBtn(WebDriver driver) {
	        return driver.findElement(By.linkText("Login"));
	            }


	}


