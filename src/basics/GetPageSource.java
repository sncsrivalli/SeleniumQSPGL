package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// ctrl + shift + o
		driver.get("https://www.google.com/");
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

}
