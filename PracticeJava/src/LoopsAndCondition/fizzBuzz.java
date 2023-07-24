package LoopsAndCondition;

public class fizzBuzz {
public static void main(String[] args) {
	for (int i=1;i<=1000;i++) {
		if (i%3==0) {
			System.out.println("Fizz");
		}if (i%3==0) {
			continue;
		}
		if (i%5==0) {
			System.out.println("Buzz");
			}
		if (i%5==0) {
			continue;
		}
		System.out.println(i);
	}
}
}
