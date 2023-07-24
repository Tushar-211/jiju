package LoopsAndCondition;

import java.util.Scanner;

public class CalculatorIMPL implements CalculatorInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getSum() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the First number");
		int a = sc.nextInt();
		System.out.println("Enter the Second number");
		int b =sc.nextInt();
				System.out.println("Sum of the given numbers is : " + (a+b));
	}

	@Override
	public void getmulti() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the First number");
		int a = sc.nextInt();
		System.out.println("Enter the Second number");
		int b =sc.nextInt();
				System.out.println("multiplication of the given numbers is : " + a*b);
	}

	@Override
	public void getdivision() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the First number");
		int a = sc.nextInt();
		System.out.println("Enter the Second number");
		int b =sc.nextInt();
				System.out.println("division of the given numbers is : " + (a%b));
		
		
	}

	@Override
	public void getSSubsytraction() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the First number");
		int a = sc.nextInt();
		System.out.println("Enter the Second number");
		int b =sc.nextInt();
				System.out.println("Substraction of the given numbers is : " + (a-b));
	}

}
