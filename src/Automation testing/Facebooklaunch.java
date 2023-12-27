package basic_chrome_launch;

import java.beans.IntrospectionException;

import javax.swing.JScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Facebooklaunch {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
      driver.get("https:/www.facebook.com");
      Thread.sleep(1500);
      driver.findElement(By.id("email")).sendKeys("Hello@gmail.com");
      Thread.sleep(1500);
      driver.findElement(By.name("pass")).sendKeys("world@1234");
      Thread.sleep(1500);
      
       Thread.sleep(1500);
       driver.findElement(By.xpath("//a[text()='Create new account']")).click();
       JavascriptExecutor js=(JavascriptExecutor)driver;
       Thread.sleep(1500);
       WebElement  s= driver.findElement(By.xpath("//input[@name='Custom_gender']"));
       
	   js.executeScript("arguments[0].value='female';",s);
	   driver.findElement(By.xpath("(//input[@type='radio']))[3]")).click();
	   
	
       
	}

}
