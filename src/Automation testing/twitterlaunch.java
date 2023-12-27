package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twitterlaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.twitter.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("Sowmya.S");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
        

	}

}
