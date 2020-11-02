package vn.com.ntqs.demo.template;

import java.io.PrintStream;
import java.util.Scanner;

public abstract class SimpleCalculator {
	
	private static PrintStream log = System.out;
	private static Scanner cs = new Scanner(System.in);
	
	protected int num1, num2;
	protected int result;
	
	public void takeAction() {
		log.println("Enter 1st number:");
		String num1 = cs.nextLine();
		log.println("Enter 2nd number:");
		String num2 = cs.nextLine();
		
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);
		
		this.result = doCalculate(this.num1, this.num2);
		
		printResult();
	}
	
	protected abstract int doCalculate(int num1, int num2);
	protected abstract void printResult();
}
