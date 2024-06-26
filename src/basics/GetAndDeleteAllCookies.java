package basics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndDeleteAllCookies {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getDomain()+" :: "+cookie.getName()+" :: "+cookie.getExpiry());
		}
		
		driver.manage().deleteAllCookies();
		Set<Cookie> cookies2 = driver.manage().getCookies();
		System.out.println(cookies2);
		driver.quit();
	}

}
