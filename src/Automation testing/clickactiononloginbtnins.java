package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clickactiononloginbtnins {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.Instagram.com");
		Thread.sleep(1500);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement un=driver.findElement(By.name("username"));
		//js.executeScript("arguments[0].value'1234567890'",un);
		un.sendKeys("1234567890");
		Thread.sleep(1500);
		WebElement pwd=driver.findElement(By.name("password"));
		//js.executeScript("arguments[0].value='987456321'",pwd);
        pwd.sendKeys("987456321");
        WebElement btn=driver.findElement(By.xpath("//button[@type='submit']"));
        Thread.sleep(1500);
        js.executeScript("arguments[0].click();",btn);
        
        
	}

}
