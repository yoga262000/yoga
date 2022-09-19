package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\Seleniumday1\\Drivers");
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	Actions action = new Actions(driver);
	WebElement amazon = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1'"));
	action.moveToElement(amazon).perform();
}
}
	
