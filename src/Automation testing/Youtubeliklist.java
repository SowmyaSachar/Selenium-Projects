package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtubeliklist {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https:/www.YouTube.com");
	      Thread.sleep(1500);
	      driver.findElement(By.name("search_query")).sendKeys("pushpavathi songs");
	      Thread.sleep(1500);
	      driver.findElement(By.id("search-icon-legacy")).click();
	      Thread.sleep(1500);
	      driver.findElement(By.partialLinkText("Kranti | Pushpavati Kannada Song | Darshan |V Harikrishna|Shylaja Nag, B Suresha| Media House Studio")).click();
      

	}

}
