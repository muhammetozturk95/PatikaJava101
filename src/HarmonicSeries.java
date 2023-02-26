import java.util.Scanner;

public class HarmonicSeries {
	public static void main(String[] args) {
		double number;	
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = input.nextDouble();
		
		double toplam = 0;
		for(double i = 1; i <= number; i++) {
			toplam += (1 / i);	
		}
		
		System.out.println(toplam);
	}
}
