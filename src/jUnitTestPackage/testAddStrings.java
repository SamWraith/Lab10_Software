package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitStr = new jUnitFunctions();
		String res = junitStr.addString("Samir", "Nandan");
		assertEquals("SamirNandan", res);
	}

}
