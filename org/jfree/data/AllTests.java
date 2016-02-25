package org.jfree.data;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DataUtilitiesTest_CalculateColumnTotal.class, DataUtilitiesTest_CalculateRowTotal.class,
		DataUtilitiesTest_CreateNumberArray.class, DataUtilitiesTest_CreateNumberArray2D.class,
		DataUtilitiesTest_GetCumulativePercentages.class, Range_Contains_Method.class,
		Range_getCentralValue_Method.class, Range_getUpperBound_Method.class, RangeLengthTest.class,
		RangeLowerBoundTest.class , RangeTest.class,RangeConstructorTest.class, RangeConstrainTest.class})
public class AllTests {

}
