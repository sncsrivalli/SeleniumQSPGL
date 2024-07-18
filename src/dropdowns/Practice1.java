package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement allDropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select select = new Select(allDropdown);
		
		select.selectByIndex(12);
		Thread.sleep(2000);
		select.selectByValue("search-alias=computers");
		Thread.sleep(2000);
		select.selectByVisibleText("Health & Personal Care");
		
		Thread.sleep(2000);
		List<WebElement> options = select.getOptions();
		for (WebElement opt : options) {
			System.out.println(opt.getText());
		}
		
		System.out.println();
		if(select.isMultiple())
			System.out.println("Multi select drop down");
		else
			System.out.println("Single select drop down");
		
		driver.quit();
	}

}
