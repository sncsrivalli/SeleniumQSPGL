package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginBTN = driver.findElement(By.xpath("//button[.='Log in']"));
		System.out.println("Before entering credentials");
		if(loginBTN.isEnabled()) {
			System.out.println("Enabled");
			loginBTN.click();
		}
		else
			System.out.println("Disabled");
		
		driver.findElement(By.name("username")).sendKeys("4365587tiutiuy7ihuj");
		driver.findElement(By.name("password")).sendKeys("65676tuhghghbh");
		
		System.out.println("After entering credentials");
		if(loginBTN.isEnabled()) {
			System.out.println("Enabled");
			loginBTN.click();
		}
		else
			System.out.println("Disabled");
		
		driver.quit();
	}

}
