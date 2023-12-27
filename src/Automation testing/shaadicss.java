package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class shaadicss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.Shaadi.com");
		Thread.sleep(1500);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("manga@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Enter password']")).sendKeys("maga@1323");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		

	}

}
