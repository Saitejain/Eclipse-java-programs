package projectt1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://Selenium Browser Drivers//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://sportsplus.app/sports/club-league");
		Actions mv = new Actions(driver);
		mv.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Solutions')]"))).build().perform();
		mv.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Features')]"))).build().perform();
		mv.moveToElement(driver.findElement(By.xpath("//span[text()='Sports']"))).build().perform();
		mv.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Solutions')]"))).click().build().perform();
		
		
	}

}
