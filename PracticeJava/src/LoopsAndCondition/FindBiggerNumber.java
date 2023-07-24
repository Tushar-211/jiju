package LoopsAndCondition;

import java.util.Scanner;

public class FindBiggerNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the value for a ");
	int a =scanner.nextInt();
	System.out.println("Enter the valur for b ");
	int b=scanner.nextInt();
	System.out.println("Enter the value fot c");
	int c=scanner.nextInt();
	if (a>b&& a>c) {
		System.out.println("a is bigger than b and c");
	}else if( b>a && b>c){
		System.out.println("b is bigger than a and c");
	}else {
		System.out.println("c is greater than a and b");
	}
}
}
