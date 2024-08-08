package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount = 0)
	public void demo1() {
		Reporter.log("demo - 1", true);
	}
	
	@Test(invocationCount = -1)
	public void demo2() {
		Reporter.log("demo - 2", true);
	}
	
	@Test
	public void demo3() {
		Reporter.log("demo - 3", true);
	}
	
	@Test(invocationCount = 2)
	public void demo4() {
		Reporter.log("demo - 4", true);
	}
}
