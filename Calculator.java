package assignment1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Welcome To the basics Calculator");
		Scanner sc = new Scanner(System.in);
		calculator(sc);
		sc.close();

	}

	private static void calculator(Scanner sc) {
		int n;
		do {
			System.out.println("Select 1: For Addition");
			System.out.println("Select 2: For Subtraction");
			System.out.println("Select 3: For Division");
			System.out.println("Select 4: For Multiplication");
			System.out.println("Select 5: For Termination");

			n = sc.nextInt();
			switch (n) {
			case 1: {
				addition(sc);
				break;
			}
			case 2: {
				subtraction(sc);
				break;
			}
			case 3: {
				division(sc);
				break;
			}
			case 4: {
				multiplication(sc);
				break;
			}
			case 5: {
				System.out.println("Terminated Sucessfuly \n");
				break;
			}
			default:
				System.out.println("Enter Valid Input \n");
				break;
			}

		} while (n != 5);

	}

	private static void multiplication(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 Integers you wanted to multiply");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ans=m*n;
		System.out.println("The multiplication of "+n+"*"+m+"="+ans);
	}

	private static void division(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 Integers you wanted to multiply");
		double n=sc.nextDouble();
		double m=sc.nextDouble();
		Double ans=m/n;
		System.out.println("The Division of "+n+"/"+m+"="+ans);
		
	}

	private static void subtraction(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 Integers you wanted to multiply");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ans=m-n;
		System.out.println("The subtraction of "+n+"-"+m+"="+ans);
		
	}

	private static void addition(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 Integers you wanted to multiply");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ans=m+n;
		System.out.println("The addition of "+n+"+"+m+"="+ans);
		
	}

}
