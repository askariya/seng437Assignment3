package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeConstrainTest {
	private Range range; 

	@Before
	public void setUp() throws Exception {
		range = new Range (5,10); 
	}

	@Test
	public void constrainValueWithinRange() {
		double actual = range.constrain(7);
		double expected = 7; 
		assertEquals(expected, actual,0);
	}
	@Test
	public void constrainValueGreaterThanRange() {
		double actual = range.constrain(11);
		double expected = 10; 
		assertEquals(expected, actual,0);
	}
	@Test
	public void constrainValueLowerThanRange() {
		double actual = range.constrain(3);
		double expected = 5; 
		assertEquals(expected, actual,0);
	}
	

}
