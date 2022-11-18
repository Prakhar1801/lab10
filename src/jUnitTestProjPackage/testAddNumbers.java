package jUnitTestProjPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions JUnit = new jUnitFunctions();
		int result = JUnit.addNum(1,2);
		assertEquals(3, result);
	}

}
