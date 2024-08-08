package groupExecution;

import org.testng.annotations.Test;

public class TestClass2 {

	@Test(groups = "smoke")
	public void test1() {
		System.out.println("TestClass2 - test1 - smoke");
	}
	
	@Test(groups = "regression")
	public void test2() {
		System.out.println("TestClass2 - test2 - regression");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void test3() {
		System.out.println("TestClass2 - test3 - smoke and regression");
	}
}
