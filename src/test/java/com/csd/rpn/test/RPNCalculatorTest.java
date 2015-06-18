package com.csd.rpn.test;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RPNCalculatorTest extends TestCase{
	
	TestParser test = new TestParser();
	
	@Before
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		
	}

	//Positive Scenario for ADD operator
	@Test
	public void testTwoNumbersWithOneAddOperator() {
		String input = "1 2 3 +";
		Double aa = TestParser.validateRPN(input);
		assertEquals(4.2, aa);
	}
	
	@Test
	public void testThreeNumbersWithTwoAddOperator() {
		String input = "2 2 3 + -";
		Double aa = TestParser.validateRPN(input);
		assertEquals(-3.0, aa);
		
	}
	
	@Test
	public void testNNumbersWithNAddOperator() {
		String input = "2-";
		Double aa = TestParser.validateRPN(input);
		assertEquals(-1.0, aa);
		
	}
	
	@Test
	public void testTwoNumbersWithOneMinusOperator() {
		String input = "2 2 -";
		Double aa = TestParser.validateRPN(input);
		assertEquals(0.0, aa);
		
	}
	
	@Test
	public void testThreeNumbersWithTwoMinusOperator() {
		String input = "2 2 5 - -";
		Double aa = TestParser.validateRPN(input);
		assertEquals(5.0, aa);
		
	}
	
	@Test
	public void testNNumbersWithNMinusOperator() {
		String input = "2 -";
		Double aa = TestParser.validateRPN(input);
		assertEquals(-1.0, aa);
		
		
	}
	
	@Test
	public void testTwoNumbersWithOneMultiplicationOperator() {
		String input = "2 5 *";
		Double aa = TestParser.validateRPN(input);
		assertEquals(10.0, aa);
		
	}
	
	@Test
	public void testThreeNumbersWithTwoMultiplicationOperator() {
		String input = "2 5 7 * *";
		Double aa = TestParser.validateRPN(input);
		assertEquals(70.0, aa);
		
	}
	
	@Test
	public void testNNumbersWithNMultiplicationOperator() {
		String input = "2 5 7 5 * * *";
		Double aa = TestParser.validateRPN(input);
		assertEquals(350.0, aa);
	}
	
	@Test
	public void testTwoNumbersWithOneDivisionOperator() {
		String input = "5 5 /";
		Double aa = TestParser.validateRPN(input);
		assertEquals(1.0, aa);
		
	}
	
	@Test
	public void testThreeNumbersWithTwoDivisionOperator() {
		String input = "5 5 5 / / ";
		Double aa = TestParser.validateRPN(input);
		assertEquals(5.0, aa);
	}
	
	@Test
	public void testNNumbersWithNDivisionOperator() {
		String input = "5 5 5 5 / / /";
		Double aa = TestParser.validateRPN(input);
		assertEquals(1.0, aa);
	}
	
	
	
	@Test
	public void testTwoNumbersWithPowerOperator() {
		String input = "2 5 5 ^ ";
		Double aa = TestParser.validateRPN(input);
		assertEquals(3125.0, aa);
	}
	
	@Test
	public void testNNumbersWithNDivisionOperator1() {
		String input = "5 5 5 5 / / /";
		Double aa = TestParser.validateRPN(input);
		assertEquals(1.0, aa);
	}
	
	//Negative Scenario for ADD operator  
	
	@Test
	public void testValidInput() {
		String input = "4 4 *";
		Double aa = TestParser.validateRPN(input);
		assertEquals(16, aa);
		
	}
	
	@Test
	public void testInvalidInput() {
		String input = "4 4 4 * 4";
		Double aa = TestParser.validateRPN(input);
		assertEquals(-1.0, aa);
		
		
	}
	
	public void testNumbersWithFactorial() {
		String input = "12 3 / !";
		Double aa = TestParser.validateRPN(input);
		assertEquals(24.0, aa);
		
		
	}

}
