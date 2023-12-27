package basic_chrome_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtableAssig {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

		driver.get("https://demoqa.com/webtables");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("span[id='delete-record-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("span[id='delete-record-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("span[id='delete-record-3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Maddy");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("Mad");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("maddy@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='age']")).sendKeys("24");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='salary']")).sendKeys("150423");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='department']")).sendKeys("Testing");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[id='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Sonu");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("S");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("Sonu@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='age']")).sendKeys("26");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='salary']")).sendKeys("15678");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='department']")).sendKeys("Testing");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[id='submit']")).click();
	}

	}


