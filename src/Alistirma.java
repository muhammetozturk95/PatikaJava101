import java.util.Scanner;

public class Alistirma {
	public static void main(String[] args) {
		int number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz: ");
		number = input.nextInt();
		
		for(int i = 1; i <= number; i*=2) {
			System.out.println(i);
		}	
	}
}
