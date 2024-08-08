package groupExecution;

import org.testng.annotations.Test;

public class TestClass4 {

	@Test
	public void test1() {
		System.out.println("TestClass4 - test1");
	}
	
	@Test
	public void test2() {
		System.out.println("TestClass4 - test2");
	}
	
	@Test(groups = {"smoke", "sanity", "regression"})
	public void test3() {
		System.out.println("TestClass4 - test3 - smoke and sanity and regression");
	}
}
