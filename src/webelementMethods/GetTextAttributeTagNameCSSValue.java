package webelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAttributeTagNameCSSValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginBTN = driver.findElement(By.xpath("//button[.='Log in']"));
		
		System.out.println(loginBTN.getText());
		System.out.println(loginBTN.getTagName());
		System.out.println(loginBTN.getAttribute("type"));
		System.out.println(loginBTN.getCssValue("background-color"));
		System.out.println(loginBTN.getCssValue("color"));
		System.out.println(loginBTN.getCssValue("font"));
		
		driver.quit();
	}

}
