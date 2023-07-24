package LoopsAndCondition;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to get reversed");
		int a = scanner.nextInt();
		int r;
		while (a != 0) {
			r = a % 10;
			System.out.print(r);
			a = a / 10;

		}
	}
}
