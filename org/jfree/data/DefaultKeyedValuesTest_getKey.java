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

	Mockery mockingContext;
	KeyedValues kv;
	
	@Before
	public void setUp() throws Exception {
	
		mockingContext = new Mockery();
		
		kv = mockingContext.mock(KeyedValues.class);
		
	}

	@After
	public void tearDown() throws Exception {
		mockingContext = null;
		kv = null;
	}

	@Test(timeout = 1000, expected=IndexOutOfBoundsException.class)
	public void keyedValueIsNull() {
		
		int item = 1;
		
		mockingContext.checking(new Expectations() {
			{
				
			}
		});
		
		//get the result of the call to getValue (should be null)
			//Number result = defKVal.getValue(item);
		
		//assertEquals("getValue return value", null, result);
		
	}
	
	//TODO Can't test full branch coverage?

}
