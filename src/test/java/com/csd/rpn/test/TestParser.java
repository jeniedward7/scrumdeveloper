package com.csd.rpn.test;


public class TestParser {


	public static Double validateRPN(String input){
		RPNCalculator ep = new RPNCalculator();
		String equation = input;
		double result = ep.parse(equation);
		System.out.println("The result of the expression: " + result);
		return result;
	}
}
