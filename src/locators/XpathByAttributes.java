package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributes {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptops");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement header = driver.findElement(By.xpath("//span[@class='BUOuZu']"));
		
		if(header.getText().contains("laptops"))
			System.out.println("Navigated to laptops page");
		else
			System.out.println("Search not successful");
		
		driver.quit();
	}
		
		
}
