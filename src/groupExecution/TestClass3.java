package groupExecution;

import org.testng.annotations.Test;

public class TestClass3 {

	@Test(groups = "regression")
	public void test1() {
		System.out.println("TestClass3 - test1 - regression");
	}
	
	@Test(groups = "sanity")
	public void test2() {
		System.out.println("TestClass3 - test2 - sanity");
	}
	
	@Test(groups = {"regression", "sanity"})
	public void test3() {
		System.out.println("TestClass3 - test3 - regression and sanity");
	}
}
