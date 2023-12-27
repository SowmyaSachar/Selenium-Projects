package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
      driver.get("https:/www.facebook.com");
      Thread.sleep(1500);
      driver.findElement(By.xpath("//a[text()='Create new account']")).click();
      JavascriptExecutor js=(JavascriptExecutor)driver;
      Thread.sleep(1500);
      driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
     driver.findElement(By.xpath("//input[@name='custom_gender']")).sendKeys("female");
      
	   js.executeScript("arguments[0].value='female';");
	   
	   

	}

}
