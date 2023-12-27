package basic_chrome_launch;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoqachildparent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(1500);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(1500);
		String pid=driver.getWindowHandle();
		System.out.println(pid);
		Set<String>allid=driver.getWindowHandles();
		for(String id:allid);

		
		
		

	}

}
