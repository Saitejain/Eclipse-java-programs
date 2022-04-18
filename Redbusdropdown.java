package projectt1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Redbusdropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://Selenium Browser Drivers//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Hyderabad");
		Thread.sleep(3000);
		List<WebElement> places = driver.findElements(By.cssSelector("li[class='sub-city']"));
		for(WebElement place :places) {
			if(place.getText().equalsIgnoreCase("Gachibowli, Hyderabad")) {
				place.click();
				break;
			}
		}
		driver.findElement(By.id("dest")).sendKeys("Vijayawada");
		Thread.sleep(2000);
		List<WebElement> secondplace = driver.findElements(By.cssSelector("li[class='sub-city']"));
		for(WebElement place2 :secondplace) {
			if(place2.getText().equalsIgnoreCase("Gunadala, Vijayawada")) {
				place2.click();
				break;
			}
		}
		/*driver.findElement(By.id("dest")).sendKeys("darsi");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("li[class='selected']")).click();*/
		/*
		 * WebElement statdropdown = driver.findElement(By.id("src")); Select dropdown =
		 * new Select(statdropdown); dropdown.selectByVisibleText("");
		 */
		//driver.findElement(By.id("dest")).sendKeys("darsi");
		driver.findElement(By.cssSelector("input[id='onward_cal']")).click();
		while(!driver.findElement(By.cssSelector("[class='rb-calendar'] [class='monthTitle']")).getText().contains("Sept 2022")) {
			driver.findElement(By.cssSelector("[class='rb-calendar'] [class='next']")).click();
		}
		List<WebElement> days = driver.findElements(By.cssSelector("td.wd.day"));
		 int count = driver.findElements(By.cssSelector("td.wd.day")).size();
		 for(int i=0;i<count;i++) {
			 
			 String text = driver.findElements(By.cssSelector("td.wd.day")).get(i).getText();
			 if(text.equalsIgnoreCase("19")) {
				 driver.findElements(By.cssSelector("td.wd.day")).get(i).click();
				 break;
			 }
			 
		 }
		
		//driver.findElement(By.cssSelector("td[class='current day']")).click();
		// WebElement statdropdown = driver.findElement(By.id("onward_cal"));
		// Select dropdown = new Select(statdropdown);
		// dropdown.selectByValue("26");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[id='search_btn']")).click();
		System.out.println(driver.findElement(By.cssSelector("button#search_btn.fl.button")).isSelected());
        
	}

}
