/**
 *  Author:  Joseph Thalman
 *  
 *  Main program for the calculator application.
*/

import java.util.Scanner;

public class Calculator {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Print welcome message
		System.out.println("Welcome to the calculator!");

		// Display U
		int operation = getOperation();

		// Perfrm operation
		switch(operation) {
			case 1:
				add();
				break;
			case 2:
				subtract();
				break;
			case 3:
				multiply();
				break;
			case 4:
				divide();
				break;
			default:
				System.out.println("Error: Unsupported operation.");
				break;
		}
		
		System.out.println("Thank you!");
		
		scanner.close();

	}

	public static int getOperation() {

		// Display options
		System.out.println("Please select an operation");
		System.out.println("1: Add");
		System.out.println("2: Subtract");
		System.out.println("3: Multiply");
		System.out.println("4: Divide");

		// Collect user input
		int input = scanner.nextInt();

		return input;
	}

	public static void promptOperands(char operand) {
		System.out.println("Enter operands (x " + operand + " y):");
	}

	public static void add() {
		promptOperands('+');
		
		// Collect user input
		int operand1 = scanner.nextInt();
		int operand2 = scanner.nextInt();

		int result = operand1 + operand2;

		System.out.println(operand1 + " + " + operand2 + " = " + result);
	}

	public static void subtract() {
		promptOperands('-');
		
		// Collect user input
		int operand1 = scanner.nextInt();
		int operand2 = scanner.nextInt();

		int result = operand1 - operand2;

		System.out.println(operand1 + " - " + operand2 + " = " + result);
	}

	public static void multiply() {
		promptOperands('*');
		
		// Collect user input
		int operand1 = scanner.nextInt();
		int operand2 = scanner.nextInt();

		int result = operand1 * operand2;

		System.out.println(operand1 + " * " + operand2 + " = " + result);
	}

	public static void divide() {
		promptOperands('/');
		
		// Collect user input
		int operand1 = scanner.nextInt();
		int operand2 = scanner.nextInt();

		float result = (float)operand1 / operand2;

		System.out.printf("%d / %d = %.2f\n", operand1, operand2, result);
	}

}
