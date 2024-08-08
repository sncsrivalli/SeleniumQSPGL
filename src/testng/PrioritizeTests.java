package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PrioritizeTests {

	@Test
	public void demo1() {
		Reporter.log("demo - 1", true);
	}
	
	@Test(priority = -1)
	public void demo2() {
		Reporter.log("demo - 2", true);
	}
	
	@Test
	public void demo3() {
		Reporter.log("demo - 3", true);
	}
	
	@Test(priority = 2)
	public void demo4() {
		Reporter.log("demo - 4", true);
	}
}
