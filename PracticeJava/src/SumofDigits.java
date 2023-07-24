import java.util.Scanner;

public class SumofDigits {
	public void getSum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scanner.nextInt();
		int s = 0;
		while (a != 0) {
			int r = a % 10;
			s = s + r;
			a = a / 10;
		}System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SumofDigits sumofDigits=new SumofDigits();
sumofDigits.getSum();                                                          
	}

}
