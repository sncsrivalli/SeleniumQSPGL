package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.className("ui-autocomplete-input")).sendKeys("head phones");
		driver.findElement(By.className("btn-prim")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
