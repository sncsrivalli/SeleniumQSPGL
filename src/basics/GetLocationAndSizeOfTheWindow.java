package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationAndSizeOfTheWindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		Dimension dimension = driver.manage().window().getSize();
		int height = dimension.getHeight();
		int width = dimension.getWidth();

		System.out.println("Height: " + height + "\nWidth: " + width);

		Point point = driver.manage().window().getPosition();
		int x = point.getX();
		int y = point.getY();

		System.out.println("X coordinates: " + x + "\nY coordinates: " + y);

		driver.quit();
	}

}
