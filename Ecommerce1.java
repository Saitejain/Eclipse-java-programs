package projectt1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://Selenium Browser Drivers//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] veggies = {"Tomato","Cauliflower","Brinjal","Capsicum"};
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		for(int i=0;i<products.size();i++) {
			
		String name= products.get(i).getText();	
		List veggiesadd = Arrays.asList(veggies);
		
		if(veggiesadd.contains(name))
		{
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			
			
		}
		}
	}

}
