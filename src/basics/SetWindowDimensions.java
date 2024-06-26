package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindowDimensions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		Dimension dimension = new Dimension(1300, 500);
		driver.manage().window().setSize(dimension);
		
		Thread.sleep(2000);
		driver.close();
	}

}
