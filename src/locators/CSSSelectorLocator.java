package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("468796563563332");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("565656356");
		driver.findElement(By.cssSelector("button.selected")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
