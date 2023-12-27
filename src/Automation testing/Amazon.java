package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.Amazon.com");
		Thread.sleep(1500);
		 WebElement search_text = driver.findElement(By.id("twotabsearchtextbox"));
 search_text.sendKeys("Mobile Phones");
 Thread.sleep(1500);
 search_text.clear();
	}

	

	

}
