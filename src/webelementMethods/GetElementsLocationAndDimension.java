package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsLocationAndDimension {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
//		Point location = createAccount.getLocation();
//		System.out.println("X coordinate: " + location.getX() + "\tY coordinate: " 
//																	+ location.getY());
//
//		Dimension dimension = createAccount.getSize();
//		System.out.println("Height: " + dimension.getHeight() + "\tWidth: " 
//																	+ dimension.getWidth());
//		

		Rectangle rect = createAccount.getRect();
		System.out.println("X coordinate: " + rect.getX() + "\tY coordinate: " + rect.getY());
		System.out.println("Height: " + rect.getHeight() + "\tWidth: " + rect.getWidth());

		driver.quit();

	}

}
