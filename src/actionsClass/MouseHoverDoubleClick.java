package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement courseTab = driver.findElement(By.id("course"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(courseTab).perform();
		
		driver.findElement(By.xpath("//span/a[text()='selenium']")).click();
		WebElement quantity = driver.findElement(By.id("quantity"));
		int initialQuantity = Integer.parseInt(quantity.getAttribute("value"));
		
		WebElement plusButton = driver.findElement(By.id("add"));
		actions.doubleClick(plusButton).perform();
		
		int finalQuantity = Integer.parseInt(quantity.getAttribute("value"));
		
		if(finalQuantity == (initialQuantity+1))
			System.out.println("Test Passed");
		else
			System.out.println("Test Failed");
		
		driver.quit();
	}

}
