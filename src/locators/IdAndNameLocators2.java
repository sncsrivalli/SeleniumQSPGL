package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndNameLocators2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.name("field-keywords")).sendKeys("shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
