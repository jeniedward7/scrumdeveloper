package com.csd.rpn.test;

import java.util.Stack;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RPNCalculator {
	Double op1;
	Double op2;
	Double result;
	//String charc1;
	//String 
	char operator;


	public static boolean isNumber(String x) {
		try {
			Double.parseDouble(x);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	

	public Double parse(String expression) {
		Stack<Double> stack = new Stack<Double>();
		/*Pattern pattern = Pattern.compile("[0-9]$");
		Matcher matcher = pattern.matcher(expression);
		if (matcher.find()){
            System.out.println("Invalid Expression ");
            return -1.0;
        }*/
		StringTokenizer st = new StringTokenizer(expression);
		while (st.hasMoreTokens()) {
			String c = st.nextToken();
			if (RPNCalculator.isNumber(c)) {
				Double x = Double.parseDouble(c);
				stack.push(x);
			} else {
				operator = c.charAt(0);
				if (stack.size() < 2) {
					//System.out.println("Invalid Expression ");
					//return -1.0;
					op1 = stack.pop();
				} else {
					op2 = stack.pop();
					op1 = stack.pop();
				}
				
				result = getResult(stack);
				System.out.println("result : " +result);

			}

		}
		return result;
	}
	
	
	
	private double getResult(Stack<Double> stack){
		System.out.println("inside");
		
		if(operator == '*'){
			stack.push(op1 * op2);
		}else if(operator == '/'){
			stack.push(op1 / op2);
		}else if(operator == '+'){
			stack.push(op1 + op2);
		}else if(operator == '-'){
			stack.push(op1 - op2);
		}else if(operator == '^'){
			stack.push(Math.pow(op1, op2));
		}else if(operator == '%'){
			stack.push(op1 / 100);
		}else if (operator == '!'){
			double fact = 1;
	        for (double i = 1; i <= op1; i++) {
	        	stack.push(fact *= i);
	        }
		}
		return stack.peek();
	}
	
	

}
