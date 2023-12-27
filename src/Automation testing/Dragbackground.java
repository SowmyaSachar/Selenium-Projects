package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dragbackground {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
      driver.get("https:/www.amazon.com");
      Thread.sleep(1500);
      Point p=new Point(400,200);
      Thread.sleep(1500);
      driver.manage().window().setPosition(p);
      
 


	}

}
