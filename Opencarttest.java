package projectt1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Opencarttest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://Selenium Browser Drivers//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/");
		Actions moving = new Actions(driver);
		//moving.moveToElement(driver.findElement(By.xpath("//a[@class='btn btn-link navbar-btn']"))).build().perform();
	    driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.linkText("OpenCart Books")).click();
		Thread.sleep(3000);
		moving.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Enter your email address']"))).click().keyDown(Keys.SHIFT).sendKeys("friendgmail.com").build().perform();
	    moving.moveToElement(driver.findElement(By.linkText("Instant E-commerce with OpenCart: Build a Shop How-to"))).click().build().perform();
	    Set<String>windows = driver.getWindowHandles();
	    Iterator<String> it = windows.iterator();
	    String parentid = it.next();
	    driver.switchTo().window(parentid);
	    driver.close();
	}

}
