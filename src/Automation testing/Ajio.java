package basic_chrome_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ajio {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.ajio.com");
driver.quit();
	}

}
 