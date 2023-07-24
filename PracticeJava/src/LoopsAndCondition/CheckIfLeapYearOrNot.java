package LoopsAndCondition;

import java.util.Scanner;

public class CheckIfLeapYearOrNot {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); 
	System.out.println("Enter any year to check whether it is leap year or not");
	int a = scanner.nextInt();
	if (a%2==0) {
		System.out.println("the given year is leap year");
	}else {
		System.out.println("the given year is not a leap year");
	}
}
}
