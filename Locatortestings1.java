package projectt1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatortestings1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://Selenium Browser Drivers//chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.opencart.com/index.php?route=account/login");
        driver.findElement(By.id("input-email")).sendKeys("friend@gmail.com");
        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-email")).sendKeys("2ndattempt@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("thrwew");
        driver.findElement(By.cssSelector("button.btn.btn-primary.btn-lg.hidden-xs")).click();
        System.out.println(driver.findElement(By.cssSelector("div.alert.alert-danger")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
	}

}
