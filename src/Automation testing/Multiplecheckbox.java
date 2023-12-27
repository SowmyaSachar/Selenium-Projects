package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplecheckbox {

	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
driver.get("file:///C:/Users/PRIYANKA%20S/Desktop/Multiplecheckbox.html");
Thread.sleep(1500);
driver.findElement(By.tagName("input")).sendKeys("Data Passing");
Thread.sleep(1500);
driver.findElement(By.id("cbox")).click();
Thread.sleep(2000);
driver.findElement(By.tagName("a")).click();
	}

}
