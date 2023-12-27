package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shaadixpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Shaadi.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@ name='email']")).sendKeys("Hellow world");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@ name='password']")).sendKeys("Hellow world@123");
		driver.findElement(By.xpath("//button[@data-testid='sign_in']")).click();
	}

}
