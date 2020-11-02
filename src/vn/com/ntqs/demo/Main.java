package vn.com.ntqs.demo;

import java.io.Console;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	private static PrintStream log = System.out;
	private static Scanner cs = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.println("!~ SIMPLE CALCULATOR ~!");
		log.println("Choose arithmetic operations (+ or -):");
		
		String operation = cs.nextLine();
		if (operation.equals("+")) {
			doAdd();
		} else if (operation.equals("-")) {
			doSub();
		} else {
			log.println("Not supported!");
		}
		
	}
	
	public static void doAdd() {
		log.println("Enter 1st number:");
		String num1 = cs.nextLine();
		log.println("Enter 2nd number:");
		String num2 = cs.nextLine();
		
		log.format("The ADD result: %s + %s = %d", num1, num2, Integer.parseInt(num1) + Integer.parseInt(num2));
	}
	
	public static void doSub() {
		log.println("Enter 1st number:");
		String num1 = cs.nextLine();
		log.println("Enter 2nd number:");
		String num2 = cs.nextLine();
		
		log.format("The SUB result: %s - %s = %d", num1, num2, Integer.parseInt(num1) - Integer.parseInt(num2));
	}
}
