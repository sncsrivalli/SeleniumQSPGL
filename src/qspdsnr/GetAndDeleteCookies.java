package qspdsnr;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndDeleteCookies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName()+"::"+cookie.getDomain()+"::"
																+cookie.getExpiry());
		}
		
		driver.manage().deleteAllCookies();
		System.out.println("After deleting the cookies:");
		System.out.println(driver.manage().getCookies());
		driver.quit();
	}

}
