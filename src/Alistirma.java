import java.util.Scanner;

public class Alistirma {
	public static void main(String[] args) {
		int number;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz: ");
		number = input.nextInt();
		
		for(int i = 1; i <= number; i*=4) {
			System.out.println(i);
		}	
		
		for(int j = 1; j <= number; j*=5) {
			System.out.println(j);
		}
	}
}
