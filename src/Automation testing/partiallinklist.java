package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class partiallinklist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
driver.get("https:/www.google.com/doodles");
Thread.sleep(1500);
driver.findElement(By.linkText("Senegal")).click();
	}

	}


