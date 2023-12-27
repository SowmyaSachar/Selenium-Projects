package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textfielinteract {

	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///F:/HTML/text%20field.html");
		driver.findElement(By.tagName("input")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.name("user-name")).sendKeys("world");
		Thread.sleep(2000);
		driver.findElement(By.className("text-field")).sendKeys("I AM QA");
		Thread.sleep(2000);
		driver.quit();
	}

}
