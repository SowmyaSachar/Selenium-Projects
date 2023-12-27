package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement login_btn=driver.findElement(By.xpath("//button[@type='submit']"));
		Dimension Size=login_btn.getSize();
		System.out.println(Size);
		int h=Size.getHeight();
		int W=Size.getWidth();
		System.out.println(h+" "+W);
	}

}
