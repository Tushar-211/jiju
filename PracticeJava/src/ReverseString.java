import java.util.Scanner;

public class ReverseString {
	public void Rstr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name to get reversed");
		String str = sc.next();
		String rstr = " ";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			rstr = ch + rstr;
			//System.out.println(rstr);
		}
	
		System.out.println(rstr);
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.Rstr();
	}

}
