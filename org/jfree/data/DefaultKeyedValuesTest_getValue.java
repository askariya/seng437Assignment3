package org.jfree.data;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DefaultKeyedValuesTest_getValue {

	Mockery mockingContext;
	KeyedValue kv;
	DefaultKeyedValues defKVal;
	
	@Before
	public void setUp() throws Exception {
		mockingContext = new Mockery();
		kv = mockingContext.mock(KeyedValue.class);
		
		defKVal = new DefaultKeyedValues();
		
	}

	@After
	public void tearDown() throws Exception {
		mockingContext = null;
		kv = null;
	}

	@Test(expected=IndexOutOfBoundsException.class)
	public void keyedValueIsNull() {
		
		int item = 1;
		
		mockingContext.checking(new Expectations() {
			{
				
			//	kv = ;
//				one(kv).getColumnCount();
//				will(returnValue(2));
//				one(kv).getValue(0, 0);
//				will(returnValue(7.5));
				
			}
		});
		
		//get the result of the call to getValue (should be null)
			Number result = defKVal.getValue(item);
		
		assertEquals("getValue return value", null, result);
		
	}
	
	//TODO Can't test full branch coverage?

}
