package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webshopcss {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Sowmya");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("S");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sowmyas2000@gmail.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Sg&ln@500");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Sg&ln@500");
        driver.findElement(By.xpath("//input[@id='register-button']")).click();
	}

}
