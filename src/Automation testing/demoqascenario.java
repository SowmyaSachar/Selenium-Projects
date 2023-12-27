package basic_chrome_launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoqascenario {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/producttag/11/jewelry']")).click();
		driver.findElement(By.xpath("//a[@href='/black-white-diamond-heart']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-14']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.name("CountryId")).click();
		driver.findElement(By.xpath("//value[@text()='41']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
				
		

	}

}
