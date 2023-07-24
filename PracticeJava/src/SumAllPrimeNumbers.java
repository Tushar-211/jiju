import java.util.Scanner;

public class SumAllPrimeNumbers {
public void getSum() {
	int i,j;
	int s =0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number");
	int a = scanner.nextInt();
	
	for (i=1;i<=a;i++) {
		for (j=2;j<i;j++) {
			if (i%j==0) {
				break;
			}
		}if (i==j) {
			System.out.println(i);
			s=s+i;
			
		}
		
	}
	System.out.println("The Total of all prime number is : " + s);
}
public static void main(String[] args) {
	SumAllPrimeNumbers sumAllPrimeNumbers=new SumAllPrimeNumbers();
	sumAllPrimeNumbers.getSum();
	
}
}
