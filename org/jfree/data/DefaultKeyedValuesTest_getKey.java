package org.jfree.data;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DefaultKeyedValuesTest_getKey {

	DefaultKeyedValues defKVal;
	
	@Before
	public void setUp() throws Exception {
		
		defKVal = new DefaultKeyedValues();
		defKVal.addValue((Comparable<Integer>)1, 16);
		defKVal.addValue((Comparable<Integer>)2, 4);
		defKVal.addValue((Comparable<Integer>)3, 8);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	
	/**
	 * Test for negative index
	 */
	@Test(timeout = 1000, expected=IndexOutOfBoundsException.class)
	public void indexIsNegative() {
		
		Integer index = -1;
		defKVal.getKey(index); //don't need to check return value because an exception is expected
	}
	
	/**
	 * Test for out of bounds index
	 */
	@Test(timeout = 1000, expected=IndexOutOfBoundsException.class)
	public void indexIsOutOfBounds() {
		
		Integer index = 4;
		defKVal.getKey(index); //don't need to check return value because an exception is expected
	}
	
	/**
	 * Test for valid index
	 */
	@Test (timeout = 1000)
	public void indexIsValid() {
		
		//get the key at index 3
		Integer index = 2;
		Comparable<Integer> result = defKVal.getKey(index); 
		
		assertEquals(result, 3);
	}
	
	
	
	
	//TODO Can't test full branch coverage??

}
