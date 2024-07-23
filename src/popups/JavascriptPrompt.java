package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPrompt {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert a = driver.switchTo().alert();
		String text_on_popup = a.getText();
		System.out.println(text_on_popup);
		
		a.sendKeys("selenium");
		a.accept();
		
		String result = driver.findElement(By.id("result")).getText();
		System.out.println(result);
		
		driver.quit();
	}

}
