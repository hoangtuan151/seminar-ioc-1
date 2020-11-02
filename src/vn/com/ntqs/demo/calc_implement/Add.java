package vn.com.ntqs.demo.calc_implement;

import java.io.PrintStream;
import vn.com.ntqs.demo.template.SimpleCalculator;

public class Add extends SimpleCalculator {
	
	private static PrintStream log = System.out;

	protected int doCalculate(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	protected void printResult() {
		// TODO Auto-generated method stub
		log.format("The ADD result: %d + %d = %d", this.num1, this.num2, this.result);
	}

}
