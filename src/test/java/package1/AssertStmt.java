package package1;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AssertStmt {
	
	@Test
	public void positiveDigit() {
		System.out.println("Welcome to jenkins world");
		int a=4,b=6;
		int c = a+b;
		if(c>0) {
			System.out.println("test passed");
			Assert.assertTrue(true);
			System.out.println("It is positive digit");
		}
		else
		{
			System.out.println("test failed");
			Assert.assertTrue(false);
			System.out.println("It is negative digit");
		}
	}
	@Ignore
	@Test
	public void failConsciously() {
			Assert.assertTrue(false);//Fails the test case and tells the TESTNG to give the report as test case failed

	}

	}

	
	
	


