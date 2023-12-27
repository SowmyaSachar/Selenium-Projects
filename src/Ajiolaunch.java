import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Ajiolaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://bstackdemo.com/");
		

	}

}
