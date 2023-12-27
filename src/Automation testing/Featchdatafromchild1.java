package basic_chrome_launch;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Featchdatafromchild1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(1500);
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("messageWindowButton")).click();
		Thread.sleep(1500);
		String pid=driver.getWindowHandle();
		System.out.println(pid);
		Set<String>allid=driver.getWindowHandles();
		Thread.sleep(1500);
		for(String id:allid)
		{
			driver.switchTo().window(id);
			Thread.sleep(1500);
			String Url=driver.getCurrentUrl();
			if(Url.equals("https://demoqa.com/sample"))
			{
				String text=driver.findElement(By.id("sample Heading")).getTagName();
						System.out.println(text);
Thread.sleep(1000);
driver.close();
				
			}
		}


	}

}
