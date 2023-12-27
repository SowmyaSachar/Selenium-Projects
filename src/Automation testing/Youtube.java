package basic_chrome_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.Youtube.com");
String tittle=driver.getTitle();
System.out.println(tittle);
String Url=driver.getCurrentUrl();
System.out.println(Url);
Thread.sleep(1500);
driver.quit();
	}

}
