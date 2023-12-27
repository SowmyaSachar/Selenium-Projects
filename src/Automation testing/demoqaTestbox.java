package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoqaTestbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.cssSelector("input[id='userName']")).sendKeys("Priyanka");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Priyanka@1465");
		driver.findElement(By.cssSelector("textarea[id='currentAddress']")).sendKeys("Gandhi Nagar");
        driver.findElement(By.cssSelector("textarea[id='permanentAddress']")).sendKeys("Gandhi Nagar");
		driver.findElement(By.cssSelector("button[id='submit']")).click();
		

	}
	
}
