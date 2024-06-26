package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndNameLocators {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("678546545645");
		driver.findElement(By.id("pass")).sendKeys("46854654");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
