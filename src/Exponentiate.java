import java.util.Scanner;

public class Exponentiate {
	public static void main(String[] args) {
		int base, pow, result = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter base number: ");
		base = input.nextInt();
		
		System.out.print("enter pow number: ");
		pow = input.nextInt();
		
		
//		int i = 1, result = 1;
//		
//		while(i <= pow) {
//			result *= base;
//			i++;
//		}
		
		for(int i = 1; i <= pow; i++) {
			result *= base;
		}
		
		System.out.println("result is: " + result);
	}
}
