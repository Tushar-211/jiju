package LoopsAndCondition;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number to get factorial of : ");
	int a = scanner.nextInt();
	for (int i=1; i<=a;i++) {
		if (a%i==0) {
			System.out.println( i);
		}
	}
}
}
