package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("4685465246324623");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("68546546524655");
		driver.findElement(By.xpath("//button[ . = 'Log in']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
