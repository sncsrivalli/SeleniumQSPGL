package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingElementReference {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement header = driver.findElement(By.xpath("//h2[text()='Explore Popular Categories']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", header);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
