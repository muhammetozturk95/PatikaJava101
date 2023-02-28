import java.util.Scanner;

public class MakeTriangleFromStars {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz: ");
		int number = input.nextInt();
		
		for(int i = 0; i <= number; i++) {
			for(int j = 0; j <= (number - i); j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= (2 * i + 1); k++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
		
		for(int i = number-1; i >= 0; i--) {
			
			for(int j = 0; j <= (number - i); j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= (2 * i + 1); k++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
	}
}
