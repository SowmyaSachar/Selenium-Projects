package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Instgramcss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Instagram.com");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("manga@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("maga@1323");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
	}

}
