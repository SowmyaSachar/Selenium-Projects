package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webshoplogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sowmyas2000@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Sg&ln@500");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
       
        
        

	}

}
