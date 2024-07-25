package popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.swiggy.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com/");
		
		switchToWindow("google");
		
		driver.findElement(By.name("q")).sendKeys("JIRA");
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(2000);
		driver.close();
		
		switchToWindow("flipkart");
		//driver.findElement(By.className("_30XB9F")).click();
		driver.findElement(By.name("q")).sendKeys("ipad");
		driver.findElement(By.className("_2iLD__")).submit();
		Thread.sleep(2000);
		driver.close();
		
		switchToWindow("swiggy");
		WebElement logo = driver.findElement(By.cssSelector("svg._8pSp-"));
		if(logo.isDisplayed())
			System.out.println("Logo is Displayed");
		else
			System.out.println("Logo not found");
		driver.close();
		
		switchToWindow("facebook");
		String headerText = driver.findElement(By.className("_8eso")).getText();
		System.out.println(headerText);
		driver.quit();
	}
	
	public static void switchToWindow(String url) {
		Set<String> windowIDs = driver.getWindowHandles();
		Iterator<String> it = windowIDs.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			if(driver.getCurrentUrl().contains(url))
				break;
		}
	}

}
