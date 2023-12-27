package basic_chrome_launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Twitter.com");
		String tittle=driver.getTitle();
		System.out.println(tittle);
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		Thread.sleep(1500);
		driver.quit();

	}

}
