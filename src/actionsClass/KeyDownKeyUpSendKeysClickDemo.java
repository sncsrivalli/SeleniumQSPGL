package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownKeyUpSendKeysClickDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement usernameTF = driver.findElement(By.id("email"));
		WebElement loginBTN = driver.findElement(By.name("login"));
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(usernameTF,"gfghjhguukjkgj").keyUp(Keys.SHIFT)
			.sendKeys(Keys.TAB+ "hgvhvhbj").click(loginBTN).build().perform();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
