package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(1500);
		driver.get("https://www.Amazon.com");
		driver.findElement(By.name("field-keywords")).sendKeys("Iphone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		

	}

}
