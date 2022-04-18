package projectt1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Staticdropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F://Selenium Browser Drivers//chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement Stdpdown = driver.findElement(By.id("dropdown-class-example"));
        Select dpdown = new Select(Stdpdown);
        dpdown.selectByIndex(1);
        dpdown.selectByIndex(3);
        driver.findElement(By.cssSelector("input[value='radio2']")).click();
       System.out.println(driver.findElement(By.cssSelector("input[value='radio2']")).isSelected());
        driver.findElement(By.cssSelector("input[value='radio3']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[value='radio3']")).isSelected());
        System.out.println( driver.findElement(By.cssSelector("input[value='radio2']")).isSelected());
        driver.findElement(By.id("checkBoxOption1")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("checkBoxOption2")).click();
        System.out.println( driver.findElement(By.id("checkBoxOption2")).isSelected());
       /* driver.get("https://www.spicejet.com/");
        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
        int i=1;
        while(i<8) {
        driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
        i++;
        }
        int j=1;
        while(j<2){
        driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click();
        j++;
        }*/
        
	}

}
