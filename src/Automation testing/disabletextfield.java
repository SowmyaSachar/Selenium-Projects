package basic_chrome_launch;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class disabletextfield {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///F:/HTML/disable%20text%20field.html");
		Thread.sleep(1500);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElement ById('text-field').Value='abcd' ");
	Thread.sleep(1500);
	js.executeScript("document.getElement ById('text-field').Value=' ' ");
	}

}
