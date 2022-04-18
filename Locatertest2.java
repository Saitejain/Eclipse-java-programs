package projectt1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatertest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://Selenium Browser Drivers//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.id("AccLogin")).click();
	    
		driver.findElement(By.name("mobile")).sendKeys("9874563210");
		driver.findElement(By.id("getotp")).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
