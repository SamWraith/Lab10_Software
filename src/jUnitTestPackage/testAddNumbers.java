package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int res;
		 res = junit.addNumbers(100, 200);
		 assertEquals(300,res);
		
	}

}
