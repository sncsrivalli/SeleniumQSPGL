package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.cssSelector("button._2iLD__")).click();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).click();
		
		String parentID = driver.getWindowHandle();
		Set<String> windowIDs = driver.getWindowHandles();
		
		for (String id : windowIDs) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains("Apple iPhone 15 (Black, 128 GB)"))
				break;
		}
		
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(parentID);
		driver.navigate().refresh();
		
		String text = driver.findElement(By.className("ZuSA--")).getText();
		System.out.println(text);
		
		driver.quit();		
	}
}
