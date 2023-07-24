import java.util.Scanner;

public class CheckPallindrome {
	

	public static void checkPallindrome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number to check palllindrome");
		int a = scanner.nextInt();
		int z = a;
		int s=0;
		while (a != 0) {
			int r = a % 10;
			s = s * 10 + r;
			a = a / 10;

		}
		if (z == s) {
			System.out.println("the given number is pallindrome");
		} else {
			System.out.println("the given numnber is not pallindrome");
		}
	}
public static void main(String[] args) {
//	CheckPallindrome checkPallindrome = new CheckPallindrome();
	checkPallindrome();
	
}
}					
			
