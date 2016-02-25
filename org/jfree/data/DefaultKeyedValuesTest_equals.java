package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DefaultKeyedValuesTest_equals {

	DefaultKeyedValues dkvs;
	
	@Before
	public void setUp() throws Exception {
		dkvs = new DefaultKeyedValues();
		dkvs.addValue((Comparable<Integer>)1, 25);
		dkvs.addValue((Comparable<Integer>)3, 26);
		dkvs.addValue((Comparable<Integer>)4, 2);
		dkvs.addValue((Comparable<Integer>)6, 7);
		dkvs.addValue((Comparable<Integer>)5, null);
	}

	@After
	public void tearDown() throws Exception {
		dkvs = null;
	}

	@Test
	public void testSameObject() {
		boolean result = dkvs.equals(dkvs);
		assertEquals(true, result);
	}
	
	@Test
	public void testDifferentObject() {
		boolean result = dkvs.equals(10);
		assertEquals(false, result);
	}
	
	@Test
	public void testSameValues() {
		DefaultKeyedValues defKeyValues = new DefaultKeyedValues();
		defKeyValues.addValue((Comparable<Integer>)1, 25);
		defKeyValues.addValue((Comparable<Integer>)3, 26);
		defKeyValues.addValue((Comparable<Integer>)4, 2);
		defKeyValues.addValue((Comparable<Integer>)6, 7);
		defKeyValues.addValue((Comparable<Integer>)5, null);
		boolean result = dkvs.equals(defKeyValues);
		assertEquals(true, result);
	}
	
	@Test
	public void testDifferentDefaultKeyedValues() {
		DefaultKeyedValues defKeyValues = new DefaultKeyedValues();
		defKeyValues.addValue((Comparable<Integer>)1, 25);
		defKeyValues.addValue((Comparable<Integer>)3, 26);
		defKeyValues.addValue((Comparable<Integer>)4, 2);
		boolean result = dkvs.equals(defKeyValues);
		assertEquals(false, result);
	}
	
	@Test
	public void testSomeSimmilarValues() {
		DefaultKeyedValues defKeyValues = new DefaultKeyedValues();
		defKeyValues.addValue((Comparable<Integer>)1, 25);
		defKeyValues.addValue((Comparable<Integer>)3, 26);
		defKeyValues.addValue((Comparable<Integer>)4, 2);
		defKeyValues.addValue((Comparable<Integer>)6, 7);
		defKeyValues.addValue((Comparable<Integer>)5, 10);
		boolean result = dkvs.equals(defKeyValues);
		assertEquals(false, result);
	}
	
	@Test
	public void testSomeNullValues() {
		DefaultKeyedValues defKeyValues = new DefaultKeyedValues();
		defKeyValues.addValue((Comparable<Integer>)1, 25);
		defKeyValues.addValue((Comparable<Integer>)3, null);
		defKeyValues.addValue((Comparable<Integer>)4, 2);
		defKeyValues.addValue((Comparable<Integer>)6, 7);
		defKeyValues.addValue((Comparable<Integer>)5, 10);
		boolean result = dkvs.equals(defKeyValues);
		assertEquals(false, result);
	}
	
	@Test
	public void testSomeSimmilarKeys() {
		DefaultKeyedValues defKeyValues = new DefaultKeyedValues();
		defKeyValues.addValue((Comparable<Integer>)1, 25);
		defKeyValues.addValue((Comparable<Integer>)3, 26);
		defKeyValues.addValue((Comparable<Integer>)2, 2);
		defKeyValues.addValue((Comparable<Integer>)6, 7);
		defKeyValues.addValue((Comparable<Integer>)5, 10);
		boolean result = dkvs.equals(defKeyValues);
		assertEquals(false, result);
	}
	
}
