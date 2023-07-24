import java.util.Scanner;

public class Factorials {
public void getfactors () {
	int s=1;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number to get facotrs of ");
	int b = scanner.nextInt();
	for (int a =b; a>=1;a--) {
		System.out.println("Below are the factors of given number " + a);
		s=s*a;
	}
System.out.println("Factor of given numbers is :" + s);
}
public static void main(String[] args) {
	Factorials factorials=new  Factorials();
	factorials.getfactors();
}
}
