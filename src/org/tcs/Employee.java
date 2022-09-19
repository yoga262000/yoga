package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Employee {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari\\eclipse-workspace\\Seleniumday1\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	Actions action = new Actions(driver);
action.moveToElement(driver.findElement(By.xpath("//a[@id='Login']"))).build().perform();

}
}
