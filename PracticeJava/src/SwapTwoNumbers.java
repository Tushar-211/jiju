import java.util.Scanner;

public class SwapTwoNumbers {
public void twoNumbersSwap() {
	System.out.println("Enter the first numbers to get swap");
	Scanner sc = new Scanner(System.in);
	int a =sc.nextInt();
	System.out.println("Enter the second numbers to get swap");
	int b=sc.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapping the first number is :" + a);
	System.out.println("After swapping the Second number is :" + b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  SwapTwoNumbers swapTwoNumbers=new SwapTwoNumbers();
  swapTwoNumbers.twoNumbersSwap();
	}

}
