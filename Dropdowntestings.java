package projectt1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowntestings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://Selenium Browser Drivers//chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();     
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement statdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(statdropdown);
	   dropdown.selectByIndex(2);
	   System.out.println(dropdown.getFirstSelectedOption().getText());
	  /* dropdown.selectByValue("INR");
	   System.out.println(dropdown.getFirstSelectedOption().getText());
	   dropdown.selectByVisibleText("USD");
	   System.out.println(dropdown.getFirstSelectedOption().getText());*/
	   driver.findElement(By.id("divpaxinfo")).click();
	   int i = 1;
	   while(i<5) {
		   
		 driver.findElement(By.id("hrefIncAdt")).click(); 
		 i++;
	   }
	   
	   driver.findElement(By.id("btnclosepaxoption")).click();
	}

}
