package LoopsAndCondition;

import java.util.Scanner;

public class CheckNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number");
	int a = scanner.nextInt();
	if (a>0) {
		System.out.println("The given input is positive");
	}else if(a<0) {
		System.out.println("The given number is negative");
	}else {
		System.out.println("The given number is zero");
	}
}
}
