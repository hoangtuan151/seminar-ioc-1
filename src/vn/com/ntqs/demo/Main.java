package vn.com.ntqs.demo;

import java.io.Console;
import java.io.PrintStream;
import java.util.Scanner;

import vn.com.ntqs.demo.calc_implement.Add;
import vn.com.ntqs.demo.calc_implement.Sub;

public class Main {

	private static PrintStream log = System.out;
	private static Scanner cs = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.println("!~ SIMPLE CALCULATOR ~!");
		log.println("Choose arithmetic operations (+ or -):");
		
		String operation = cs.nextLine();
		if (operation.equals("+")) {
			Add addInst = new Add();
			addInst.takeAction();
		} else if (operation.equals("-")) {
			Sub subInst = new Sub();
			subInst.takeAction();
		} else {
			log.println("Not supported!");
		}
		
	}
	
	@Deprecated
	public static void doAdd() {
		log.println("Enter 1st number:");
		String num1 = cs.nextLine();
		log.println("Enter 2nd number:");
		String num2 = cs.nextLine();
		
		log.format("The ADD result: %s + %s = %d", num1, num2, Integer.parseInt(num1) + Integer.parseInt(num2));
	}
	
	@Deprecated
	public static void doSub() {
		log.println("Enter 1st number:");
		String num1 = cs.nextLine();
		log.println("Enter 2nd number:");
		String num2 = cs.nextLine();
		
		log.format("The SUB result: %s - %s = %d", num1, num2, Integer.parseInt(num1) - Integer.parseInt(num2));
	}
}
