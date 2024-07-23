package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlerts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert a = driver.switchTo().alert();
		String text_on_popup = a.getText();
		a.accept();
		System.out.println(text_on_popup);
		
		String result = driver.findElement(By.id("result")).getText();
		System.out.println(result);
		
		driver.quit();
	}

}
