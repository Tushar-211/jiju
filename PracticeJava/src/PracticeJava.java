import java.util.Scanner;

public class PracticeJava {
	int a, b, c;

	public void getSum() {
		System.out.println("VELOCITY MOCK INTERVIEW");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks out of 20");
		int a = sc.nextInt();
		if (a <= 10) {
			System.out.println("The Student is in Red Zone ");
		} else if (a >= 10 && a < 15) {
			System.out.println("The Student is in Yellow Zone");
		} else if
		(a >= 15 && a <= 20) {
			System.out.println("The Student is in Green Zone");
		} else {
			System.out.println("Incorrect input");
		}
	}
}