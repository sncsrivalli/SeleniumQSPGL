package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select select = new Select(dropdown);
		select.selectByIndex(0);
		select.selectByValue("99");
		select.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		
		if(select.isMultiple()) {
			System.out.println(select.getFirstSelectedOption().getText()+"\n");
			List<WebElement> selectedOptions = select.getAllSelectedOptions();
			for (WebElement opt : selectedOptions) {
				System.out.println(opt.getText());
			}
			
//			Thread.sleep(2000);
//			select.deselectByIndex(0);
//			Thread.sleep(2000);
//			select.deselectByValue("99");
//			Thread.sleep(2000);
//			select.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
//			Thread.sleep(2000);
			
			select.deselectAll();
		}
		
		driver.quit();
	}

}
