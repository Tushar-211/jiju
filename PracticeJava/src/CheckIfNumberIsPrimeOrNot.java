import java.util.Scanner;

public class CheckIfNumberIsPrimeOrNot {
	public void CheckPrimeNumber() {
		System.out.println("Enter the number to check it is prime or not");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				count++;
			}
		}if (count==2) {
			System.out.println("The given number is Prime Number");
		}else {
			System.out.println("The given number is not Prime Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	}

}
