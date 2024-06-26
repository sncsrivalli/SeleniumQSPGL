package basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindowPosition {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		Point point = new Point(500, 500);
		driver.manage().window().setPosition(point);
		Thread.sleep(2000);
		driver.close();
	}

}
