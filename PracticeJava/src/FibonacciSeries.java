import java.util.Scanner;

public class FibonacciSeries {
	public void fibonacciSeries() {
		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.println("ENTER THE NUMBER UPTO WHICH YOU WANT FIBONACCI SERIES");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(num1);
		System.out.println(num2);

		for (int i = 1; i <= 10000; i++) {
			num3 = num1 + num2;
			if (num3 > a) {
				break;
			}
			System.out.println(num3);
			num1 = num2;
			num2 = num3;

		}
	}

	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.fibonacciSeries();
	}
}