package hu.jakusmarton.mymath2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyMathTest {
	@Test
	public void testAdddPositive() {
		assertEquals(5, MyMath2.myAdd(3, 2));
	}
}
