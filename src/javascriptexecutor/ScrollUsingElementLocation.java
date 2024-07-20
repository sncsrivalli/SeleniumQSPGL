package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingElementLocation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement searchTF = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchBTN = driver.findElement(By.id("nav-search-submit-button"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1]", searchTF, "wallets");
		js.executeScript("arguments[0].click()", searchBTN);

		Thread.sleep(2000);

		WebElement price = driver.findElement(By.xpath("//span[text()='Price']"));
		Point point = price.getLocation();
		int x = point.getX();
		int y = point.getY();

		//js.executeScript("window.scrollTo(" + x + "," + y + ")");
		
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
		Thread.sleep(2000);
		driver.quit();
	}

}
