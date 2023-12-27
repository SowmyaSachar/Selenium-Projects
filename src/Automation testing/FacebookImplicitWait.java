package basic_chrome_launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
      driver.get("https:/www.facebook.com");
      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
      driver.findElement(By.id("email")).sendKeys("Hello@gmail.com");
      
      driver.findElement(By.name("pass")).sendKeys("world@1234");
      driver.findElement(By.name("login")).click();
     
      

	}

}
