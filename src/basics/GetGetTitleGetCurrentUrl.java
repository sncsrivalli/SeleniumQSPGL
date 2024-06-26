package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetGetTitleGetCurrentUrl {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		System.out.println("Title of the we page: "+ title);
		System.out.println("Url of the web page: "+ url);
	}

}
