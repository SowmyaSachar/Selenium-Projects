package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newprj {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.Youtube.com");
      Thread.sleep(1500);
      driver.findElement(By.xpath("//input[@id='search']")).sendKeys("clam down");
      Thread.sleep(1500);
      driver.findElement(By.id("search-icon-legacy")).click();
      Thread.sleep(1500);
      driver.findElement(By.xpath("//a[@title='Rema, Selena Gomez - Calm Down (Official Music Video)']")).click();
      
      	
	}

}
