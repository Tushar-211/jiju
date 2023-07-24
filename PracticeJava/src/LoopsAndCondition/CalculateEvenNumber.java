package LoopsAndCondition;

public class CalculateEvenNumber {

	public static void main(String[] args) {
		int s = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				s = s + i;
			}
			
		}
		System.out.println(s);
	}
}
